package in.easysystems.pojos;

// It Creates private final fields, parameterized constructor, toString, Getters, hashCode, equals by itself internally
// Setters are not created which means that they are immutable by default
public record EmployeeRecord(int empID, String empName, String empDept) {
    public void printEmpNameDept(){
        System.out.println( "Emp Name & Dept : " + (empName + " - " + empDept).toLowerCase() );
    }
}
