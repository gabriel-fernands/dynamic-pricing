package com.example.demo.priceSystem;

import java.time.LocalDateTime;

public interface PriceAdjustment {

    double ReadjustmentCalculation(LocalDateTime hora);
}
