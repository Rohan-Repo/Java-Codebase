package in.easysystems.misc;

import in.easysystems.pojos.EmployeeCls;
import in.easysystems.pojos.EmployeeRecord;

public class ClassRecordEg {
    public static void main(String[] args) {

        EmployeeCls empCls1 = new EmployeeCls( 1, "John Doe", "IT" );
        System.out.println("empCls1 = " + empCls1);
        EmployeeCls empCls2 = new EmployeeCls( 2, "Jane Doe", "Sales" );
        System.out.println("empCls2 = " + empCls2);

        EmployeeRecord empRcrd1 = new EmployeeRecord( 1, "John Doe", "IT" );
        System.out.println("empRcrd1 = " + empRcrd1);
        EmployeeRecord empRcrd2 = new EmployeeRecord( 2, "Jane Doe", "Sales" );
        System.out.println("empRcrd2 = " + empRcrd2);

        // Get Values from Object
        System.out.println("empCls2 Name = " + empCls2.getEmpName() );
        System.out.println("empRcrd2 Name = " + empRcrd2.empName() );

        // Call Record Methods
        empRcrd1.printEmpNameDept();
    }
}
