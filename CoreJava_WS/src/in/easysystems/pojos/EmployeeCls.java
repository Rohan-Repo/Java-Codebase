package in.easysystems.pojos;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;

public class EmployeeCls {
    private final int empID;
    private final String empName, empDept;
    private final double empSalary;

    public EmployeeCls(int empID, String empName, String empDept, double empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDept = empDept;
        this.empSalary = empSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeCls that = (EmployeeCls) o;
        return empID == that.empID && Double.compare(empSalary, that.empSalary) == 0 && Objects.equals(empName, that.empName) && Objects.equals(empDept, that.empDept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, empName, empDept, empSalary);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", EmployeeCls.class.getSimpleName() + "[", "]")
                .add("empID=" + empID)
                .add("empName='" + empName + "'")
                .add("empDept='" + empDept + "'")
                .add("empSalary= $" + empSalary)
                .toString();
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}
