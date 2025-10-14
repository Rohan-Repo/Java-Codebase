package in.easysystems.pojos;

import java.util.Objects;
import java.util.UUID;

public class EmployeeCls {
    private final int empID;
    private final String empName, empDept;

    public EmployeeCls(int empID, String empName, String empDept) {
        this.empID = empID;
        this.empName = empName;
        this.empDept = empDept;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n EmployeeCls{");
        sb.append("empID=").append(empID);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", empDept='").append(empDept).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeCls that = (EmployeeCls) o;
        return empID == that.empID && Objects.equals(empName, that.empName) && Objects.equals(empDept, that.empDept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, empName, empDept);
    }
}
