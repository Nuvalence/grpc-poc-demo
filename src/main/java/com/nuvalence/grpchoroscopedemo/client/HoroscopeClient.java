package com.nuvalence.grpchoroscopedemo.client;

import com.proto.ReactorHoroscopeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HoroscopeClient {

    private ReactorHoroscopeServiceGrpc.ReactorHoroscopeServiceStub stub;

    public static void main(String[] args) {
        System.out.println("This is the horoscope client");
        HoroscopeClient main = new HoroscopeClient();
        main.run();
    }

    public void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .build();

        // get horoscope

        System.out.println("Shutting down channel");
        channel.shutdown();
    }







}
