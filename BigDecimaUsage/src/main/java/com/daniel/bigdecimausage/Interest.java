package com.daniel.bigdecimausage;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String[] args) {
        // quantidade principal inicial antes do juros
        BigDecimal principal = BigDecimal.valueOf(1000.00);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        
        // exibe cabeçalhos
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        // calcula a quantidade de depósito para cada um dos dez anos
        for (int year = 1; year <= 10; year++){
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
        
        // exibe o ano e a quantidade
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
    
}
