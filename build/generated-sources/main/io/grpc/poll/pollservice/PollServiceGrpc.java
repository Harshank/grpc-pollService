package io.grpc.poll.pollservice;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class PollServiceGrpc {

  private static final io.grpc.stub.Method<io.grpc.poll.pollservice.PollRequest,
      io.grpc.poll.pollservice.PollResponse> METHOD_CREATE_POLL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "CreatePoll",
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.poll.pollservice.PollRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(io.grpc.poll.pollservice.PollResponse.PARSER));

  public static PollServiceStub newStub(io.grpc.Channel channel) {
    return new PollServiceStub(channel, CONFIG);
  }

  public static PollServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollServiceBlockingStub(channel, CONFIG);
  }

  public static PollServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollServiceFutureStub(channel, CONFIG);
  }

  public static final PollServiceServiceDescriptor CONFIG =
      new PollServiceServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class PollServiceServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<PollServiceServiceDescriptor> {
    public final io.grpc.MethodDescriptor<io.grpc.poll.pollservice.PollRequest,
        io.grpc.poll.pollservice.PollResponse> createPoll;

    private PollServiceServiceDescriptor() {
      createPoll = createMethodDescriptor(
          "grpc.poll.pollservice.PollService", METHOD_CREATE_POLL);
    }

    @SuppressWarnings("unchecked")
    private PollServiceServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      createPoll = (io.grpc.MethodDescriptor<io.grpc.poll.pollservice.PollRequest,
          io.grpc.poll.pollservice.PollResponse>) methodMap.get(
          CONFIG.createPoll.getName());
    }

    @java.lang.Override
    protected PollServiceServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new PollServiceServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          createPoll);
    }
  }

  public static interface PollService {

    public void createPoll(io.grpc.poll.pollservice.PollRequest request,
        io.grpc.stub.StreamObserver<io.grpc.poll.pollservice.PollResponse> responseObserver);
  }

  public static interface PollServiceBlockingClient {

    public io.grpc.poll.pollservice.PollResponse createPoll(io.grpc.poll.pollservice.PollRequest request);
  }

  public static interface PollServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.poll.pollservice.PollResponse> createPoll(
        io.grpc.poll.pollservice.PollRequest request);
  }

  public static class PollServiceStub extends
      io.grpc.stub.AbstractStub<PollServiceStub, PollServiceServiceDescriptor>
      implements PollService {
    private PollServiceStub(io.grpc.Channel channel,
        PollServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollServiceStub build(io.grpc.Channel channel,
        PollServiceServiceDescriptor config) {
      return new PollServiceStub(channel, config);
    }

    @java.lang.Override
    public void createPoll(io.grpc.poll.pollservice.PollRequest request,
        io.grpc.stub.StreamObserver<io.grpc.poll.pollservice.PollResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.createPoll), request, responseObserver);
    }
  }

  public static class PollServiceBlockingStub extends
      io.grpc.stub.AbstractStub<PollServiceBlockingStub, PollServiceServiceDescriptor>
      implements PollServiceBlockingClient {
    private PollServiceBlockingStub(io.grpc.Channel channel,
        PollServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollServiceBlockingStub build(io.grpc.Channel channel,
        PollServiceServiceDescriptor config) {
      return new PollServiceBlockingStub(channel, config);
    }

    @java.lang.Override
    public io.grpc.poll.pollservice.PollResponse createPoll(io.grpc.poll.pollservice.PollRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static class PollServiceFutureStub extends
      io.grpc.stub.AbstractStub<PollServiceFutureStub, PollServiceServiceDescriptor>
      implements PollServiceFutureClient {
    private PollServiceFutureStub(io.grpc.Channel channel,
        PollServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected PollServiceFutureStub build(io.grpc.Channel channel,
        PollServiceServiceDescriptor config) {
      return new PollServiceFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.poll.pollservice.PollResponse> createPoll(
        io.grpc.poll.pollservice.PollRequest request) {
      return unaryFutureCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final PollService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.poll.pollservice.PollService")
      .addMethod(createMethodDefinition(
          METHOD_CREATE_POLL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                io.grpc.poll.pollservice.PollRequest,
                io.grpc.poll.pollservice.PollResponse>() {
              @java.lang.Override
              public void invoke(
                  io.grpc.poll.pollservice.PollRequest request,
                  io.grpc.stub.StreamObserver<io.grpc.poll.pollservice.PollResponse> responseObserver) {
                serviceImpl.createPoll(request, responseObserver);
              }
            }))).build();
  }
}
