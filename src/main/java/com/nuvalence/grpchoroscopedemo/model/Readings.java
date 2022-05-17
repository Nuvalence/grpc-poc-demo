package com.nuvalence.grpchoroscopedemo.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Readings {

    private String sign;
    private String date;
    private String horoscope;

    public Readings(String sign, String date, String horoscope) {
        this.sign = sign;
        this.date = date;
        this.horoscope = horoscope;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    @Override
    public String toString() {
        return "Readings{" +
                "sign='" + sign + '\'' +
                ", date='" + date + '\'' +
                ", horoscope='" + horoscope + '\'' +
                '}';
    }
}

