package web.service.follow.rpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import web.service.follow.service.FollowService;

@GRpcService
public class FollowRpcServiceImpl extends FollowRpcServiceGrpc.FollowRpcServiceImplBase {

    private final FollowService followService;

    public FollowRpcServiceImpl(FollowService followService) {
        this.followService = followService;
    }

    @Override
    public void getFollower(GetFollowerRequest request, StreamObserver<GetFollowerResponse> responseObserver) {
        responseObserver.onNext(followService.getAllFollower(request.getUserId()));
        responseObserver.onCompleted();
    }

    @Override
    public void getFollowing(GetFollowingRequest request, StreamObserver<GetFollowingResponse> responseObserver) {
        responseObserver.onNext(followService.getAllFollowing(request.getUserId()));
        responseObserver.onCompleted();
    }
}
