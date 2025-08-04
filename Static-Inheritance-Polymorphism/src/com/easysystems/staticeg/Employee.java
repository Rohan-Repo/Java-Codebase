package com.easysystems.staticeg;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate hireDate;

    static int employeeCount;

    public Employee(String firstName, String lastName, LocalDate birthDate, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;

        // Increment Count after Every New Object is created!
        employeeCount++;
    }

    public static int getEmpCount(){
        return employeeCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", hireDate=").append(hireDate);
        sb.append('}');
        return sb.toString();
    }
}
