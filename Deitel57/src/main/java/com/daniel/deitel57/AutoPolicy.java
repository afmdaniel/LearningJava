package com.daniel.deitel57;

public class AutoPolicy {
    // VARIÁVEIS DE INSTANCIA
    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    // CONSTRUTOR
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    
    
    // METODOS
    public boolean isNoFaultState(){
        boolean noFaultState;
        switch (this.getState())
        {
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
    
    
    // GETTER AND SETTERS
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
}
