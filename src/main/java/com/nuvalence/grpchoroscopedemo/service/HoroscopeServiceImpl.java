package com.nuvalence.grpchoroscopedemo.service;

import com.proto.*;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.proto.ZodiacSign.*;

@Service
public class HoroscopeServiceImpl extends ReactorHoroscopeServiceGrpc.HoroscopeServiceImplBase {

    @Override
    public Mono<FindZodiacSignResponse> findZodiacSign(Flux<FindZodiacSignRequest> request) {
        return null;
    }

    @Override
    public Flux<HoroscopeReadingResponse> getHoroscopeReading(Mono<HoroscopeReadingRequest> request) {
        return super.getHoroscopeReading(request);
    }
}
