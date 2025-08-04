package com.easysystems.polymorphismabstractioneg;

import java.util.StringJoiner;

public class SalariedEmployee extends Employee {
    private double weeklySalary;


    public SalariedEmployee(String firstName, String lastName,
                            String socialInsuranceNumber, double weeklySalary) {

        super( firstName, lastName, socialInsuranceNumber );

        if( weeklySalary < 0.0 )
            throw new IllegalArgumentException( "Salary should be >= 0 " );

        this.weeklySalary = weeklySalary;

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {

        if( weeklySalary < 0.0 )
            throw new IllegalArgumentException( "Salary should be >= 0 " );

        this.weeklySalary = weeklySalary;
    }

    // Override the Abstract Method earnings() from Employee Class
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SalariedEmployee.class.getSimpleName() + "[", "]")
                .add("firstName= '" + super.getFirstName() + "'")
                .add("lastName= '" + super.getLastName() + "'")
                .add("socialInsuranceNumber= '" + super.getSocialInsuranceNumber() + "'")
                .add("totalEarnings=" + earnings() )
                .toString();
    }
}
