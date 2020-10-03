package web.service.follow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.service.follow.model.Follow;
import web.service.follow.repository.FollowRepository;
import web.service.follow.rpc.GetFollowerResponse;
import web.service.follow.rpc.GetFollowingResponse;

import java.util.List;

@Service
public class FollowService {

    private final FollowRepository followRepository;

    public FollowService(FollowRepository followRepository) {
        this.followRepository = followRepository;
    }

    public GetFollowerResponse getAllFollower(String userId) {
        Follow follow = followRepository.getFollowByUserId(userId);
        GetFollowerResponse.Builder response = GetFollowerResponse.newBuilder();

        if(follow != null) {
            response.addAllFollowers(follow.getFollower());
        }

        return response.build();
    }

    public GetFollowingResponse getAllFollowing(String userId) {
        Follow follow = followRepository.getFollowByUserId(userId);
        GetFollowingResponse.Builder response = GetFollowingResponse.newBuilder();

        if(follow != null) {
            response.addAllFollowing(follow.getFollowing());
        }

        return response.build();
    }
}
