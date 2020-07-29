package com.daniel.polimorfismo;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    // CONSTRUTOR
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    // GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    // toSting
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                this.getFirstName(), this.getLastName(), this.getSocialSecurityNumber());
    }

    /*
    * Observação: não implementamos o metodo getPaymentAmount de Payable aqui, assim
    * essa classe dever ser declarada abstrata para evitar um erro de compilação
    *
    * PARTE DO CODIGO DE QUANDO A INTERFACE NÃO ESTAVA IMPLEMENTADA
    *
    * // o método abstrato deve ser sobrescrito pelas subclasses concretas
    * public abstract double earnings(); // nenhuma implementação aqui
    */
}
