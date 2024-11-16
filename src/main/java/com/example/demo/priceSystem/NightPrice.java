package com.example.demo.priceSystem;

import java.time.LocalDateTime;


public class NightPrice implements PriceAdjustment {

    private static final double  STARTING_PRINCE = 150.0;
    private static final double REAJUSTE_NOITE = 50.0;


    public double ReadjustmentCalculation(LocalDateTime hora) {
        LocalDateTime now = LocalDateTime.now();
        if (hora.isBefore(now) && isAfternight(hora)) {
            return  STARTING_PRINCE + REAJUSTE_NOITE;
        }
        return STARTING_PRINCE;
    }

    private boolean isAfternight(LocalDateTime hora) {
        int hour = hora.getHour();
        return hour >= 18 || hour < 6;
    }
}


