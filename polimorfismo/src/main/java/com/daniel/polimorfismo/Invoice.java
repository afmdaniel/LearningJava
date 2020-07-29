package com.daniel.polimorfismo;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;
    
    // CONSTRUTOR
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0)  // valida quantidade
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        if (pricePerItem < 0.0) // valida preco por item
            throw new IllegalArgumentException("Price per item must be >= 0");
        
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    
    // GETTERS AND SETTERS
    public String getPartNumber() {    
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0)  // valida quantidade
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) // valida preco por item
            throw new IllegalArgumentException("Price per item must be >= 0");
        
        this.pricePerItem = pricePerItem;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s:  $%,.2f",
                "invoice", "part number", this.getPartNumber(), this.getPartDescription(),
                "quantity", this.getQuantity(), "price per item", this.getPricePerItem());
    }
    
    // metodo requerido para executar o contrato com a interface Payable
    @Override
    public double getPaymentAmount() {
        return this.getQuantity() * this.getPricePerItem(); // calcula custo total
    }
    
    
}
