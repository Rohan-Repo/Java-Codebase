package com.easysystems.inheritanceeg;

import java.util.StringJoiner;

public class BasePlusCommissionEmployeeInheritedCls extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployeeInheritedCls(String firstName, String lastName,
                                      String socialInsuranceNumber, double grossSales,
                                      double commissionRate, double baseSalary ) {
        // Call the CommissionEmployee class Constructor explicitly
        super( firstName, lastName, socialInsuranceNumber, grossSales, commissionRate );

        if( baseSalary < 0.0 )
            throw new IllegalArgumentException( "Base Salary must be >= 0 " );

        this.baseSalary = baseSalary;

        }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if( baseSalary < 0.0 )
            throw new IllegalArgumentException( "Base Salary must be >= 0 " );

        this.baseSalary = baseSalary;
    }

    public double earningInMonth(){
        return baseSalary + super.earningInMonth();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BasePlusCommissionEmployeeInheritedCls.class.getSimpleName() + "[", "]")
                .add( "Super Class = \n " + super.toString() )
                .add("\n baseSalary=" + baseSalary)
                .add("earningInMonth =" + earningInMonth() )
                .toString();
    }
}