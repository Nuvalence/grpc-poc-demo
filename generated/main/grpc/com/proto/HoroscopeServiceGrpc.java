package com.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: horoscope/horoscope.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HoroscopeServiceGrpc {

  private HoroscopeServiceGrpc() {}

  public static final String SERVICE_NAME = "HoroscopeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.FindZodiacSignRequest,
      com.proto.FindZodiacSignResponse> getFindZodiacSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindZodiacSign",
      requestType = com.proto.FindZodiacSignRequest.class,
      responseType = com.proto.FindZodiacSignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.FindZodiacSignRequest,
      com.proto.FindZodiacSignResponse> getFindZodiacSignMethod() {
    io.grpc.MethodDescriptor<com.proto.FindZodiacSignRequest, com.proto.FindZodiacSignResponse> getFindZodiacSignMethod;
    if ((getFindZodiacSignMethod = HoroscopeServiceGrpc.getFindZodiacSignMethod) == null) {
      synchronized (HoroscopeServiceGrpc.class) {
        if ((getFindZodiacSignMethod = HoroscopeServiceGrpc.getFindZodiacSignMethod) == null) {
          HoroscopeServiceGrpc.getFindZodiacSignMethod = getFindZodiacSignMethod =
              io.grpc.MethodDescriptor.<com.proto.FindZodiacSignRequest, com.proto.FindZodiacSignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindZodiacSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.FindZodiacSignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.FindZodiacSignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HoroscopeServiceMethodDescriptorSupplier("FindZodiacSign"))
              .build();
        }
      }
    }
    return getFindZodiacSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.HoroscopeReadingRequest,
      com.proto.HoroscopeReadingResponse> getGetHoroscopeReadingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHoroscopeReading",
      requestType = com.proto.HoroscopeReadingRequest.class,
      responseType = com.proto.HoroscopeReadingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.HoroscopeReadingRequest,
      com.proto.HoroscopeReadingResponse> getGetHoroscopeReadingMethod() {
    io.grpc.MethodDescriptor<com.proto.HoroscopeReadingRequest, com.proto.HoroscopeReadingResponse> getGetHoroscopeReadingMethod;
    if ((getGetHoroscopeReadingMethod = HoroscopeServiceGrpc.getGetHoroscopeReadingMethod) == null) {
      synchronized (HoroscopeServiceGrpc.class) {
        if ((getGetHoroscopeReadingMethod = HoroscopeServiceGrpc.getGetHoroscopeReadingMethod) == null) {
          HoroscopeServiceGrpc.getGetHoroscopeReadingMethod = getGetHoroscopeReadingMethod =
              io.grpc.MethodDescriptor.<com.proto.HoroscopeReadingRequest, com.proto.HoroscopeReadingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHoroscopeReading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.HoroscopeReadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.HoroscopeReadingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HoroscopeServiceMethodDescriptorSupplier("GetHoroscopeReading"))
              .build();
        }
      }
    }
    return getGetHoroscopeReadingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HoroscopeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HoroscopeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HoroscopeServiceStub>() {
        @java.lang.Override
        public HoroscopeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HoroscopeServiceStub(channel, callOptions);
        }
      };
    return HoroscopeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HoroscopeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HoroscopeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HoroscopeServiceBlockingStub>() {
        @java.lang.Override
        public HoroscopeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HoroscopeServiceBlockingStub(channel, callOptions);
        }
      };
    return HoroscopeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HoroscopeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HoroscopeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HoroscopeServiceFutureStub>() {
        @java.lang.Override
        public HoroscopeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HoroscopeServiceFutureStub(channel, callOptions);
        }
      };
    return HoroscopeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HoroscopeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.FindZodiacSignRequest> findZodiacSign(
        io.grpc.stub.StreamObserver<com.proto.FindZodiacSignResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFindZodiacSignMethod(), responseObserver);
    }

    /**
     */
    public void getHoroscopeReading(com.proto.HoroscopeReadingRequest request,
        io.grpc.stub.StreamObserver<com.proto.HoroscopeReadingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHoroscopeReadingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindZodiacSignMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.FindZodiacSignRequest,
                com.proto.FindZodiacSignResponse>(
                  this, METHODID_FIND_ZODIAC_SIGN)))
          .addMethod(
            getGetHoroscopeReadingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.HoroscopeReadingRequest,
                com.proto.HoroscopeReadingResponse>(
                  this, METHODID_GET_HOROSCOPE_READING)))
          .build();
    }
  }

  /**
   */
  public static final class HoroscopeServiceStub extends io.grpc.stub.AbstractAsyncStub<HoroscopeServiceStub> {
    private HoroscopeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HoroscopeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HoroscopeServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.FindZodiacSignRequest> findZodiacSign(
        io.grpc.stub.StreamObserver<com.proto.FindZodiacSignResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getFindZodiacSignMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getHoroscopeReading(com.proto.HoroscopeReadingRequest request,
        io.grpc.stub.StreamObserver<com.proto.HoroscopeReadingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetHoroscopeReadingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HoroscopeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HoroscopeServiceBlockingStub> {
    private HoroscopeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HoroscopeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HoroscopeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.HoroscopeReadingResponse> getHoroscopeReading(
        com.proto.HoroscopeReadingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetHoroscopeReadingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HoroscopeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HoroscopeServiceFutureStub> {
    private HoroscopeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HoroscopeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HoroscopeServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_HOROSCOPE_READING = 0;
  private static final int METHODID_FIND_ZODIAC_SIGN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HoroscopeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HoroscopeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOROSCOPE_READING:
          serviceImpl.getHoroscopeReading((com.proto.HoroscopeReadingRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.HoroscopeReadingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ZODIAC_SIGN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findZodiacSign(
              (io.grpc.stub.StreamObserver<com.proto.FindZodiacSignResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HoroscopeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HoroscopeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.Horoscope.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HoroscopeService");
    }
  }

  private static final class HoroscopeServiceFileDescriptorSupplier
      extends HoroscopeServiceBaseDescriptorSupplier {
    HoroscopeServiceFileDescriptorSupplier() {}
  }

  private static final class HoroscopeServiceMethodDescriptorSupplier
      extends HoroscopeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HoroscopeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HoroscopeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HoroscopeServiceFileDescriptorSupplier())
              .addMethod(getFindZodiacSignMethod())
              .addMethod(getGetHoroscopeReadingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
