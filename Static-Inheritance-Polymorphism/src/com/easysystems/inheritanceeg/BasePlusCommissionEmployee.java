package com.easysystems.inheritanceeg;

import java.util.StringJoiner;

// CommissionEmployee class represents en employee paid a percentage of gross sales
public class BasePlusCommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialInsuranceNumber;
    private double grossSales;
    private double commissionRate;

    private double baseSalary;

    // Parameterized Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialInsuranceNumber, double grossSales,
                                      double commissionRate, double baseSalary ) {

        // Implicit Call to Object's Classes Constructor happens here!

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialInsuranceNumber = socialInsuranceNumber;

        // Negative Gross Sales not allowed
        if( grossSales < 0 )
            throw new IllegalArgumentException( "Gross Sales must be >= 0 " );

        // Commission Rate between 0 and 1
        if( commissionRate <= 0.0 || commissionRate >= 1.0 )
            throw new IllegalArgumentException( "Commission Rate must be Between 0 and 1 " );

        // Negative base Salary Not allowed
        if( baseSalary < 0.0 )
            throw new IllegalArgumentException( "Base Salary should be >= 0 " );

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    // Default Constructor
    public BasePlusCommissionEmployee() {
        // Implicit Call to Object's Classes Constructor happens here!
        this.firstName = null;
        this.lastName = null;
        this.socialInsuranceNumber = null;
        this.grossSales = 0;
        this.commissionRate = 0;
        this.baseSalary = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialInsuranceNumber() {
        return socialInsuranceNumber;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if( baseSalary < 0.0 )
            throw new IllegalArgumentException( "Base Salary should be >= 0 " );

        this.baseSalary = baseSalary;
    }

    public double earningInMonth(){
        return baseSalary + (commissionRate * grossSales);
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", BasePlusCommissionEmployee.class.getSimpleName() + "[", "]")
                .add("firstName= '" + firstName + "'")
                .add("lastName= '" + lastName + "'")
                .add("socialInsuranceNumber= '" + socialInsuranceNumber + "'")
                .add("grossSales= " + grossSales)
                .add("commissionRate= " + commissionRate)
                .add("baseSalary= " + baseSalary)
                .add("earningInMonth= " + earningInMonth() )
                .toString();
    }
}
