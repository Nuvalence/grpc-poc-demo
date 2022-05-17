package com.nuvalence.grpchoroscopedemo.controller;

import com.nuvalence.grpchoroscopedemo.client.HoroscopeClient;
import com.nuvalence.grpchoroscopedemo.client.ReadingsClient;
import com.nuvalence.grpchoroscopedemo.model.Readings;
import com.nuvalence.grpchoroscopedemo.service.HoroscopeServiceImpl;
import com.proto.FindZodiacSignRequest;
import com.proto.ZodiacSign;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import net.devh.boot.grpc.client.inject.GrpcClient;


import java.time.Duration;
import java.util.Date;

import static com.proto.ZodiacSign.SAGITTARIUS;

@RestController
@RequestMapping("/horoscope")
public class Controller {

    private ReadingsClient readingsClient;

    public Controller(ReadingsClient readingsClient) {
        this.readingsClient = readingsClient;
    }

    @GetMapping(path = "/zodiac")
    public Mono<ZodiacSign> findZodiacSign(@RequestParam(value = "birthMonth") int birthMonth,
                                           @RequestParam(value = "birthDay") int birthDay) {

        System.out.println("Zodiac endpoint");

        ZodiacSign sign = null;
        switch (birthMonth) {
            case 1:
                sign = birthDay < 20 ? ZodiacSign.SAGITTARIUS : ZodiacSign.CAPRICORN;
                break;
            case 2:
                sign = birthDay < 19 ? ZodiacSign.AQUARIUS : ZodiacSign.PISCES;
                break;
            case 3:
                sign = birthDay < 21 ? ZodiacSign.PISCES : ZodiacSign.ARIES;
                break;
            case 4:
                sign = birthDay < 20 ? ZodiacSign.ARIES : ZodiacSign.TAURUS;
                break;
            case 5:
                sign = birthDay < 21 ? ZodiacSign.TAURUS : ZodiacSign.GEMINI;
                break;
            case 6:
                sign = birthDay < 21 ? ZodiacSign.GEMINI : ZodiacSign.CANCER;
                break;
            case 7:
                sign = birthDay < 23 ? ZodiacSign.CANCER : ZodiacSign.LEO;
                break;
            case 8:
                sign = birthDay < 23 ? ZodiacSign.LEO : ZodiacSign.VIRGO;
                break;
            case 9:
                sign = birthDay < 23 ? ZodiacSign.VIRGO : ZodiacSign.LIBRA;
                break;
            case 10:
                sign = birthDay < 23 ? ZodiacSign.LIBRA : ZodiacSign.SCORPIO;
                break;
            case 11:
                sign = birthDay < 22 ? ZodiacSign.SCORPIO : ZodiacSign.SAGITTARIUS;
                break;
            case 12:
                sign = birthDay < 22 ? ZodiacSign.SAGITTARIUS : ZodiacSign.CAPRICORN;
                break;
        }

        return Mono.just(sign);
    }

    @GetMapping(path ="/reading")
    public Flux<Readings> getReadings(@RequestParam(value = "sign") ZodiacSign sign) {
        return readingsClient.getReading(sign);
    }

}

