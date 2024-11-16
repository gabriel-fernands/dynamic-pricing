package com.example.demo.priceSystem;

import java.time.LocalDateTime;

public class ReadjustmentCalculator {

    public double calculoReajust(LocalDateTime ticket, PriceAdjustment adjustment) {
        return adjustment.ReadjustmentCalculation(ticket);
    }
}
