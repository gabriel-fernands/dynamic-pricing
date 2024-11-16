package com.example.demo.priceSystem;

import java.time.LocalDateTime;

public class LatePrice implements PriceAdjustment {

    private static final double STARTING_PRINCE = 150.0;
    private static final double LATE_ADJUSTMENT = 30.0;


    public double ReadjustmentCalculation(LocalDateTime hora) {
        LocalDateTime now = LocalDateTime.now();
        if (hora.isBefore(now) && isAfternoon(hora)) {
            return STARTING_PRINCE + LATE_ADJUSTMENT;
        }
        return STARTING_PRINCE;
    }

    private boolean isAfternoon(LocalDateTime hora) {
        int hour = hora.getHour();
        return hour >= 12 && hour < 18;
    }
}

