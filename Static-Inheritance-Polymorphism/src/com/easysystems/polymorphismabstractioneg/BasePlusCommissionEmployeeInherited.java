package com.easysystems.polymorphismabstractioneg;

import java.util.StringJoiner;

public class BasePlusCommissionEmployeeInherited extends CommissionEmployeeInherited {
    private double baseSalary;

    public BasePlusCommissionEmployeeInherited(String firstName, String lastName,
                                String socialInsuranceNumber, double grossSales,
                                double commissionRate, double baseSalary ) {

        // Explicitly calling the SuperClass CommissionEmployee Constructor
        super( firstName, lastName, socialInsuranceNumber, grossSales, commissionRate );

        if( baseSalary < 0.0 )
            throw new IllegalArgumentException( "Base Salary should be >= 0 " );

        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if( baseSalary < 0.0 )
            throw new IllegalArgumentException( "Base Salary should be >= 0 " );

        this.baseSalary = baseSalary;
    }

    // Override the Abstract Method earnings() from CommissionEmployeeInherited Class
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", BasePlusCommissionEmployeeInherited.class.getSimpleName() + "[", "]")
                .add("firstName= '" + super.getFirstName() + "'")
                .add("lastName= '" + super.getLastName() + "'")
                .add("socialInsuranceNumber= '" + super.getSocialInsuranceNumber() + "'")
                .add("grossSales= " + super.getGrossSales() )
                .add("commissionRate= " + super.getCommissionRate() )
                .add("baseSalary=" + getBaseSalary())
                .add("totalEarnings=" + earnings() )
                .toString();
    }
}
