package com.nuvalence.grpchoroscopedemo.client;

import com.nuvalence.grpchoroscopedemo.model.Readings;
import com.proto.ZodiacSign;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class ReadingsClient {

    public WebClient webClient;

    public ReadingsClient() {
        this.webClient = WebClient.builder()
                .baseUrl("https://ohmanda.com/api/horoscope/")
                .build();
    }
    public Flux<Readings> getReading(ZodiacSign sign) {
        return webClient
                .get()
                .uri(sign.toString().toLowerCase()+'/')
                .retrieve()
                .bodyToFlux(Readings.class);
    }

    public static void main(String[] args) {
        ReadingsClient api = new ReadingsClient();

        var test = api.getReading(ZodiacSign.CANCER)
                .doOnComplete(() -> {
                    System.out.println("============= howdy ");
                })
                .map(read -> {
                    System.out.println("==reading==");
                    System.out.println(read);
                    System.out.println(read.getHoroscope());
                    System.out.println(read.getSign());
                    System.out.println(read.getDate());
                    System.out.println("==reading==");
                    return read;
                })
//                .blockLast();
                .subscribe(System.out::println);


        try {
            Thread.sleep(5000);
        } catch(Exception e) {

        }
    }
}
