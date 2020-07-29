package com.daniel.polimorfismo;

public class HourlyEmployee extends Employee {
    private double wage;  // salário por hora
    private double hours; // horas trabalhadas durante a semana
    
    // CONSTRUTOR
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        
        if (wage < 0)
            throw new IllegalArgumentException(
            "Hourly wage must be >= 0");
        
        if ((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException(
            "Hours worked must be >= 0 and <= 168.0");
        }
        
        this.wage = wage;
        this.hours = hours;
    }
    
    // GETTERS AND SETTERS
    public double getWage() {
        if (wage < 0)
            throw new IllegalArgumentException(
            "Hourly wage must be >= 0");
        
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException(
            "Hours worked must be >= 0 and <= 168.0");
        }
        
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        if (this.getHours() <= 40)
            return this.getWage() * this.getHours();
        else
            return 40 * this.getWage() + (this.getHours() - 40) * this.getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", this.getWage(),
                "hours worked", this.getHours());
    }
}
