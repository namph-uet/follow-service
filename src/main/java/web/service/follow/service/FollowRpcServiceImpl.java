package web.service.follow.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import web.service.follow.rpc.*;

@GRpcService
public class FollowRpcServiceImpl extends FollowRpcServiceGrpc.FollowRpcServiceImplBase {

    @Autowired
    private FollowService followService;

    @Override
    public void getFollower(GetFollowerAndFollowingRequest request, StreamObserver<GetFollowerResponse> responseObserver) {
        responseObserver.onNext(followService.getAllFollower(request.getUserId()));
        responseObserver.onCompleted();
    }

    @Override
    public void getFollowing(GetFollowerAndFollowingRequest request, StreamObserver<GetFollowingResponse> responseObserver) {
        responseObserver.onNext(followService.getAllFollowing(request.getUserId()));
        responseObserver.onCompleted();
    }

    @Override
    public void addFollow(AddFollowRequest request, StreamObserver<AddFollowResponse> responseObserver) {
        responseObserver.onNext(followService.addFollowerAndFollowing(request));
        responseObserver.onCompleted();
    }
}
