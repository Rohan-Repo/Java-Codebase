package com.easysystems.interfaceeg;

// Since we didn't implement the getPayableAmount() method here we declared this class as Abstract

public abstract class EmployeeInterfaceObj  implements Payable {

    private final String firstName;
    private final String lastName;
    private final String socialInsuranceNumber;

    public EmployeeInterfaceObj() {
        this.firstName = null;
        this.lastName = null;
        this.socialInsuranceNumber = null;
    }

    public EmployeeInterfaceObj(String firstName, String lastName, String socialInsuranceNumber) {
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
        final StringBuilder sb = new StringBuilder("EmployeeInterfaceObj {");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", socialInsuranceNumber='").append(socialInsuranceNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

