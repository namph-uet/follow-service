// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: follow.proto

package web.service.follow.rpc;

/**
 * Protobuf service {@code FollowRpcService}
 */
public  abstract class FollowRpcService
    implements com.google.protobuf.Service {
  protected FollowRpcService() {}

  public interface Interface {
    /**
     * <code>rpc getFollower(.GetFollowerAndFollowingRequest) returns (.GetFollowerResponse);</code>
     */
    public abstract void getFollower(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request,
        com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowerResponse> done);

    /**
     * <code>rpc getFollowing(.GetFollowerAndFollowingRequest) returns (.GetFollowingResponse);</code>
     */
    public abstract void getFollowing(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request,
        com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowingResponse> done);

    /**
     * <code>rpc addFollow(.AddFollowRequest) returns (.AddFollowResponse);</code>
     */
    public abstract void addFollow(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.AddFollowRequest request,
        com.google.protobuf.RpcCallback<web.service.follow.rpc.AddFollowResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new FollowRpcService() {
      @java.lang.Override
      public  void getFollower(
          com.google.protobuf.RpcController controller,
          web.service.follow.rpc.GetFollowerAndFollowingRequest request,
          com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowerResponse> done) {
        impl.getFollower(controller, request, done);
      }

      @java.lang.Override
      public  void getFollowing(
          com.google.protobuf.RpcController controller,
          web.service.follow.rpc.GetFollowerAndFollowingRequest request,
          com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowingResponse> done) {
        impl.getFollowing(controller, request, done);
      }

      @java.lang.Override
      public  void addFollow(
          com.google.protobuf.RpcController controller,
          web.service.follow.rpc.AddFollowRequest request,
          com.google.protobuf.RpcCallback<web.service.follow.rpc.AddFollowResponse> done) {
        impl.addFollow(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.getFollower(controller, (web.service.follow.rpc.GetFollowerAndFollowingRequest)request);
          case 1:
            return impl.getFollowing(controller, (web.service.follow.rpc.GetFollowerAndFollowingRequest)request);
          case 2:
            return impl.addFollow(controller, (web.service.follow.rpc.AddFollowRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return web.service.follow.rpc.GetFollowerAndFollowingRequest.getDefaultInstance();
          case 1:
            return web.service.follow.rpc.GetFollowerAndFollowingRequest.getDefaultInstance();
          case 2:
            return web.service.follow.rpc.AddFollowRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return web.service.follow.rpc.GetFollowerResponse.getDefaultInstance();
          case 1:
            return web.service.follow.rpc.GetFollowingResponse.getDefaultInstance();
          case 2:
            return web.service.follow.rpc.AddFollowResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc getFollower(.GetFollowerAndFollowingRequest) returns (.GetFollowerResponse);</code>
   */
  public abstract void getFollower(
      com.google.protobuf.RpcController controller,
      web.service.follow.rpc.GetFollowerAndFollowingRequest request,
      com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowerResponse> done);

  /**
   * <code>rpc getFollowing(.GetFollowerAndFollowingRequest) returns (.GetFollowingResponse);</code>
   */
  public abstract void getFollowing(
      com.google.protobuf.RpcController controller,
      web.service.follow.rpc.GetFollowerAndFollowingRequest request,
      com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowingResponse> done);

  /**
   * <code>rpc addFollow(.AddFollowRequest) returns (.AddFollowResponse);</code>
   */
  public abstract void addFollow(
      com.google.protobuf.RpcController controller,
      web.service.follow.rpc.AddFollowRequest request,
      com.google.protobuf.RpcCallback<web.service.follow.rpc.AddFollowResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return web.service.follow.rpc.Follow.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.getFollower(controller, (web.service.follow.rpc.GetFollowerAndFollowingRequest)request,
          com.google.protobuf.RpcUtil.<web.service.follow.rpc.GetFollowerResponse>specializeCallback(
            done));
        return;
      case 1:
        this.getFollowing(controller, (web.service.follow.rpc.GetFollowerAndFollowingRequest)request,
          com.google.protobuf.RpcUtil.<web.service.follow.rpc.GetFollowingResponse>specializeCallback(
            done));
        return;
      case 2:
        this.addFollow(controller, (web.service.follow.rpc.AddFollowRequest)request,
          com.google.protobuf.RpcUtil.<web.service.follow.rpc.AddFollowResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return web.service.follow.rpc.GetFollowerAndFollowingRequest.getDefaultInstance();
      case 1:
        return web.service.follow.rpc.GetFollowerAndFollowingRequest.getDefaultInstance();
      case 2:
        return web.service.follow.rpc.AddFollowRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return web.service.follow.rpc.GetFollowerResponse.getDefaultInstance();
      case 1:
        return web.service.follow.rpc.GetFollowingResponse.getDefaultInstance();
      case 2:
        return web.service.follow.rpc.AddFollowResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends web.service.follow.rpc.FollowRpcService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void getFollower(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request,
        com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowerResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        web.service.follow.rpc.GetFollowerResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.follow.rpc.GetFollowerResponse.class,
          web.service.follow.rpc.GetFollowerResponse.getDefaultInstance()));
    }

    public  void getFollowing(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request,
        com.google.protobuf.RpcCallback<web.service.follow.rpc.GetFollowingResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        web.service.follow.rpc.GetFollowingResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.follow.rpc.GetFollowingResponse.class,
          web.service.follow.rpc.GetFollowingResponse.getDefaultInstance()));
    }

    public  void addFollow(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.AddFollowRequest request,
        com.google.protobuf.RpcCallback<web.service.follow.rpc.AddFollowResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        web.service.follow.rpc.AddFollowResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.follow.rpc.AddFollowResponse.class,
          web.service.follow.rpc.AddFollowResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public web.service.follow.rpc.GetFollowerResponse getFollower(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.follow.rpc.GetFollowingResponse getFollowing(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.follow.rpc.AddFollowResponse addFollow(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.AddFollowRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public web.service.follow.rpc.GetFollowerResponse getFollower(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.follow.rpc.GetFollowerResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        web.service.follow.rpc.GetFollowerResponse.getDefaultInstance());
    }


    public web.service.follow.rpc.GetFollowingResponse getFollowing(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.GetFollowerAndFollowingRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.follow.rpc.GetFollowingResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        web.service.follow.rpc.GetFollowingResponse.getDefaultInstance());
    }


    public web.service.follow.rpc.AddFollowResponse addFollow(
        com.google.protobuf.RpcController controller,
        web.service.follow.rpc.AddFollowRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.follow.rpc.AddFollowResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        web.service.follow.rpc.AddFollowResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:FollowRpcService)
}

