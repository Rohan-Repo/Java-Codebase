package com.easysystems.polymorphismabstractioneg;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialInsuranceNumber;

    public Employee() {
        this.firstName = null;
        this.lastName = null;
        this.socialInsuranceNumber = null;
    }

    public Employee(String firstName, String lastName, String socialInsuranceNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialInsuranceNumber = socialInsuranceNumber;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", socialInsuranceNumber='").append(socialInsuranceNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Abstract method to be overridden by the concrete subclasses
    public abstract double earnings();
}
