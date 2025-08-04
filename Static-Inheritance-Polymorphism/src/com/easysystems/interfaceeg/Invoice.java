package com.easysystems.interfaceeg;

import java.util.StringJoiner;

public class Invoice implements Payable {

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        if( quantity < 0 )
            throw new IllegalArgumentException( "Quantity must be >= 0" );

        if( pricePerItem < 0 )
            throw new IllegalArgumentException( "pricePerItem must be >= 0" );

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

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

        if( quantity < 0 )
            throw new IllegalArgumentException( "Quantity must be >= 0" );

        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {

        if( pricePerItem < 0 )
            throw new IllegalArgumentException( "pricePerItem must be >= 0" );

        this.pricePerItem = pricePerItem;
    }

    // Method Required to Carry out the Contract with the Payable Interface
    @Override
    public double getPayableAmount() {
        // Calculate Total Cost
        return getQuantity() * getPricePerItem();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Invoice.class.getSimpleName() + "[", "]")
                .add("partNumber='" + partNumber + "'")
                .add("partDescription='" + partDescription + "'")
                .add("quantity=" + quantity)
                .add("pricePerItem=" + pricePerItem)
                .add("getPayableAmount=" + getPayableAmount() )
                .toString();
    }
}
