package com.ayowole.strategy;

import java.math.BigDecimal;

class COFINS implements Tax {

    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.subtract(value.multiply(new BigDecimal("0.076")));
    }

}
