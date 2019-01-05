package com.ayowole.strategy;

import java.math.BigDecimal;

class Main {
    
    public static void main(String[] args) {
        Tax icms = new ICMS();
        Tax pis = new PIS();
        Tax cofins = new COFINS();
        
        BigDecimal value = new BigDecimal("10.0");
        
        value = icms.calculate(value);
        value = pis.calculate(value);
        value = cofins.calculate(value);
        
        System.out.println(value.setScale(2, BigDecimal.ROUND_CEILING));
    }
    
}
