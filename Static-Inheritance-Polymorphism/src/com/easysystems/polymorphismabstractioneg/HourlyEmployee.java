package com.easysystems.polymorphismabstractioneg;

import java.util.StringJoiner;

public class HourlyEmployee extends Employee {
    private double wage; //  Wage per Hour
    private double hours; // Hours worked for the week

    public HourlyEmployee(String firstName, String lastName,
                                String socialInsuranceNumber,
                                double wage, double hours ) {

        super( firstName, lastName, socialInsuranceNumber );

        if( wage < 0.0 )
            throw new IllegalArgumentException( "Hourly Wage must be >= 0" );

        if( ( hours < 0.0 ) || (hours > 168.0) )
            throw new IllegalArgumentException( "Hours worked must be between 0 and 168" );

        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {

        if( wage < 0.0 )
            throw new IllegalArgumentException( "Hourly Wage must be >= 0" );

        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {

        if( ( hours < 0.0 ) || (hours > 168.0) )
            throw new IllegalArgumentException( "Hours worked must be between 0 and 168" );

        this.hours = hours;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", HourlyEmployee.class.getSimpleName() + "[", "]")
                .add("firstName= '" + super.getFirstName() + "'")
                .add("lastName= '" + super.getLastName() + "'")
                .add("socialInsuranceNumber= '" + super.getSocialInsuranceNumber() + "'")
                .add("wage=" + wage)
                .add("hours=" + hours)
                .add("totalEarnings=" + earnings() )
                .toString();
    }

    // Override the Abstract Method earnings() from Employee Class
    // Until 40 Just the Wage and Hours
    // If more than 40, then till 40 their wage otherwise for extra hours worked 1.5 times their wage
    @Override
    public double earnings() {

        if( getHours() <= 40 )
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
}
