package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage{

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal saneQuantity = new BigDecimal("12345678901234567890");
        return saneQuantity;
    }
}
