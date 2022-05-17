package com.proto;

import static com.proto.HoroscopeServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: horoscope/horoscope.proto")
public final class ReactorHoroscopeServiceGrpc {
    private ReactorHoroscopeServiceGrpc() {}

    public static ReactorHoroscopeServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorHoroscopeServiceStub(channel);
    }

    public static final class ReactorHoroscopeServiceStub extends io.grpc.stub.AbstractStub<ReactorHoroscopeServiceStub> {
        private HoroscopeServiceGrpc.HoroscopeServiceStub delegateStub;

        private ReactorHoroscopeServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = HoroscopeServiceGrpc.newStub(channel);
        }

        private ReactorHoroscopeServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = HoroscopeServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorHoroscopeServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorHoroscopeServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.proto.FindZodiacSignResponse> findZodiacSign(reactor.core.publisher.Flux<com.proto.FindZodiacSignRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.manyToOne(reactorRequest, delegateStub::findZodiacSign, getCallOptions());
        }

        public reactor.core.publisher.Flux<com.proto.HoroscopeReadingResponse> getHoroscopeReading(reactor.core.publisher.Mono<com.proto.HoroscopeReadingRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToMany(reactorRequest, delegateStub::getHoroscopeReading, getCallOptions());
        }

        public reactor.core.publisher.Flux<com.proto.HoroscopeReadingResponse> getHoroscopeReading(com.proto.HoroscopeReadingRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToMany(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::getHoroscopeReading, getCallOptions());
        }

    }

    public static abstract class HoroscopeServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.proto.FindZodiacSignResponse> findZodiacSign(reactor.core.publisher.Flux<com.proto.FindZodiacSignRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Flux<com.proto.HoroscopeReadingResponse> getHoroscopeReading(reactor.core.publisher.Mono<com.proto.HoroscopeReadingRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.proto.HoroscopeServiceGrpc.getFindZodiacSignMethod(),
                            asyncClientStreamingCall(
                                    new MethodHandlers<
                                            com.proto.FindZodiacSignRequest,
                                            com.proto.FindZodiacSignResponse>(
                                            this, METHODID_FIND_ZODIAC_SIGN)))
                    .addMethod(
                            com.proto.HoroscopeServiceGrpc.getGetHoroscopeReadingMethod(),
                            asyncServerStreamingCall(
                                    new MethodHandlers<
                                            com.proto.HoroscopeReadingRequest,
                                            com.proto.HoroscopeReadingResponse>(
                                            this, METHODID_GET_HOROSCOPE_READING)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_FIND_ZODIAC_SIGN = 0;
    public static final int METHODID_GET_HOROSCOPE_READING = 1;

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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToMany((com.proto.HoroscopeReadingRequest) request,
                            (io.grpc.stub.StreamObserver<com.proto.HoroscopeReadingResponse>) responseObserver,
                            serviceImpl::getHoroscopeReading);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_FIND_ZODIAC_SIGN:
                    return (io.grpc.stub.StreamObserver<Req>) com.salesforce.reactorgrpc.stub.ServerCalls.manyToOne(
                            (io.grpc.stub.StreamObserver<com.proto.FindZodiacSignResponse>) responseObserver,
                            serviceImpl::findZodiacSign, serviceImpl.getCallOptions(methodId));
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
