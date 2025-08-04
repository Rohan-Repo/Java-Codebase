package com.easysystems.interfaceeg;

import java.util.StringJoiner;

public class SalariedEmployeeInterfaceObj extends EmployeeInterfaceObj {

    private double weeklySalary;


    public SalariedEmployeeInterfaceObj(String firstName, String lastName,
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

    // Override the Abstract Method getPayableAmount() from Interface
    @Override
    public double getPayableAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SalariedEmployeeInterfaceObj.class.getSimpleName() + "[", "]")
                .add("firstName= '" + super.getFirstName() + "'")
                .add("lastName= '" + super.getLastName() + "'")
                .add("socialInsuranceNumber= '" + super.getSocialInsuranceNumber() + "'")
                .add("getPayableAmount=" + getPayableAmount() )
                .toString();
    }

}
