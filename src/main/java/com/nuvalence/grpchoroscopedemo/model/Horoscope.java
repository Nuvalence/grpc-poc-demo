package com.nuvalence.grpchoroscopedemo.model;

public class Horoscope {
    private final String id;
    private String name;
    private ZodiacSign zodiacSign;

    public Horoscope(String id, String name, ZodiacSign horoscopeType) {
        this.id = id;
        this.name = name;
        this.zodiacSign = horoscopeType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZodiacSign getHoroscopeType() {
        return zodiacSign;
    }

    public void setHoroscopeType(ZodiacSign horoscopeType) {
        this.zodiacSign = horoscopeType;
    }

    @Override
    public String toString() {
        return "Horoscope{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", horoscopeType=" + zodiacSign +
                '}';
    }
}
