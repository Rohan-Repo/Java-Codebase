package com.easysystems.polymorphismabstractioneg;

import java.util.StringJoiner;

public class CommissionEmployeeInherited extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployeeInherited(String firstName, String lastName, String socialInsuranceNumber,
                              double grossSales, double commissionRate) {
        // Implicit Call to Object's Classes Constructor happens here!
        super( firstName, lastName, socialInsuranceNumber );

        // Negative Gross Sales not allowed
        if( grossSales < 0 )
            throw new IllegalArgumentException( "Gross Sales must be >= 0 " );

        // Commission Rate between 0 and 1
        if( commissionRate <= 0.0 || commissionRate >= 1.0 )
            throw new IllegalArgumentException( "Commission Rate must be Between 0 and 1 " );

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        // Negative Gross Sales not allowed
        if( grossSales < 0 )
            throw new IllegalArgumentException( "Gross Sales must be >= 0 " );

        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        // Commission Rate between 0 and 1
        if( commissionRate <= 0.0 || commissionRate >= 1.0 )
            throw new IllegalArgumentException( "Commission Rate must be Between 0 and 1 " );

        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CommissionEmployeeInherited.class.getSimpleName() + "[", "]")
                .add("firstName= '" + super.getFirstName() + "'")
                .add("lastName= '" + super.getLastName() + "'")
                .add("socialInsuranceNumber= '" + super.getSocialInsuranceNumber() + "'")
                .add("grossSales=" + grossSales)
                .add("commissionRate=" + commissionRate)
                .add("totalEarnings=" + earnings() )
                .toString();
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }
}
