package com.ayowole.strategy;

import java.math.BigDecimal;

interface Tax {
    
    public BigDecimal calculate(BigDecimal value);
    
}
