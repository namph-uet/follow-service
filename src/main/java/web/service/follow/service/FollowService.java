package web.service.follow.service;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.service.follow.model.Follow;
import web.service.follow.model.Status;
import web.service.follow.repository.FollowRepository;
import web.service.follow.rpc.*;

import java.util.ArrayList;

@Service
public class FollowService {

    @Autowired
    private FollowRepository followRepository;

    @Autowired
    @Qualifier("user-service")
    private ManagedChannel channel;

    public GetFollowerResponse getAllFollower(String userId) {
        Follow follow = followRepository.getFollowByUserId(userId);
        GetFollowerResponse.Builder response = GetFollowerResponse.newBuilder();

        if(follow != null) {
            if(follow.getFollower() != null)
                response.addAllFollowers(follow.getFollower());
        }
        else {
            follow = new Follow();
            follow.setUserId(userId);
            follow.setFollower(new ArrayList<>());
            follow.setFollowing(new ArrayList<>());
            followRepository.save(follow);
        }

        return response.build();
    }

    public GetFollowingResponse getAllFollowing(String userId) {
        Follow follow = followRepository.getFollowByUserId(userId);
        GetFollowingResponse.Builder response = GetFollowingResponse.newBuilder();

        if(follow != null) {
            response.addAllFollowing(follow.getFollowing() == null ?
                    new ArrayList<String>() :
                    follow.getFollowing());
        }
        else {
            follow = new Follow();
            follow.setUserId(userId);
            follow.setFollower(new ArrayList<>());
            follow.setFollowing(new ArrayList<>());
            followRepository.save(follow);
        }

        return response.build();
    }

    public AddFollowResponse addFollowerAndFollowing(AddFollowRequest request) {
        Follow follow = followRepository.getFollowByUserId(request.getUserId());
        AddFollowResponse.Builder response = AddFollowResponse.newBuilder();
        try {
            if(!checkHaveUser(request.getUserId())) {
                response.setStatus(Status.CAN_NOT_FIND_USER);
                return response.build();
            }
            else
            {
                if(request.getAddFollower())
                {
                    if(follow.getFollower() == null) follow.setFollower(new ArrayList<>());
                    follow.getFollower().add(request.getUserAdd());
                }
                else
                {
                    if(follow.getFollower() == null) follow.setFollower(new ArrayList<>());
                    follow.getFollower().add(request.getUserAdd());
                }
                followRepository.save(follow);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setStatus(Status.SUCCESS);
        return response.build();
    }

    private boolean checkHaveUser(String userId) throws Exception {
        GetUserRequest.Builder getUserRequest = GetUserRequest.newBuilder();
        getUserRequest.setUserId(userId);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        GetUserResponse getUser = null;
        getUser = stub.getUser(getUserRequest.build());
        if(getUser != null && getUser.getEmail() != null) return true;
        return false;
    }
}
