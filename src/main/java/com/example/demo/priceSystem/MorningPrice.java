package com.example.demo.priceSystem;

import java.time.LocalDateTime;


public class MorningPrice implements PriceAdjustment {

    private static final double  STARTING_PRINCE = 150.0;
    private static final double REAJUSTE_MANHA = 20.0;


    public double ReadjustmentCalculation(LocalDateTime hora) {
        LocalDateTime now = LocalDateTime.now();
        if (hora.isBefore(now) && isAftermorning(hora)) {
            return STARTING_PRINCE + REAJUSTE_MANHA;
        }
        return STARTING_PRINCE;
    }

    private boolean isAftermorning(LocalDateTime hora) {
        int hour = hora.getHour();
        return hour >= 6 && hour < 12;
    }
}


