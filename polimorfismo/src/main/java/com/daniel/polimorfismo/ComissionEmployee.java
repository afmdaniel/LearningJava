package com.daniel.polimorfismo;

public class ComissionEmployee extends Employee {
    private double grossSales;
    private double comissionRate;
    
    // CONSTRUTOR
    public ComissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, double comissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        
        if (comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException(
                "Comission rate must be > 0.0 and < 1.0");
        
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }
    
    // GETTERS AND SETTERS 
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        if (comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException(
                "Comission rate must be > 0.0 and < 1.0");
        
        this.comissionRate = comissionRate;
    }

    @Override
    public double getPaymentAmount() { // antes da implementacao da interface era "earnings()"
        return this.getComissionRate() * this.getGrossSales();
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "comission employee", super.toString(),
                "gross sales", this.getGrossSales(),
                "comission rate", this.getComissionRate());
    }

}
