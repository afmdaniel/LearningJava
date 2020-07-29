package com.daniel.polimorfismo;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    // CONSTRUTOR 
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weely salary must be >= 0");
        
        this.weeklySalary = weeklySalary;
    }
    
    // SETTERS
    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weely salary must be >= 0");
        
        this.weeklySalary = weeklySalary;
    }
    
    // GETTERS
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    // Calcula os rendimentos; sobrescreve o método earnings de Employee
    @Override
    public double getPaymentAmount() {
        return this.getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", this.getWeeklySalary());
    }
}
