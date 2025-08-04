package com.easysystems.staticeg;

import java.time.LocalDate;

public class EmpTest {
    public static void main(String[] args) {
         System.out.println(" Default employeeCount  1 = " + Employee.employeeCount );
        System.out.println(" Default employeeCount  2 = " + Employee.getEmpCount() );

        Employee emp1 = new Employee( "Susan", "Baker", LocalDate.of(1999,01,01), LocalDate.now() );
        System.out.println("\n Employee #1 Details  = " + emp1.toString() );
        System.out.println("\n employeeCount after first = " + Employee.employeeCount );
        System.out.println(" getEmpCount() after first = " + Employee.getEmpCount() );

        Employee emp2 = new Employee( "Bob", "Blue", LocalDate.of(1980,12,31), LocalDate.now().minusDays(10) );
        System.out.println("\n Employee #2 Details  = " + emp2.toString() );
        System.out.println("\n employeeCount after second = " + Employee.employeeCount );
        System.out.println(" getEmpCount() after second = " + Employee.getEmpCount() );


    }
}
