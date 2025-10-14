package in.easysystems.pojos;

import java.util.Objects;

// With equals() and hashcode()
public class Student2 {

    int studRegNum;
    String studName;
    String studDegree;

    public Student2(int studRegNum, String studName, String studDegree) {
        this.studRegNum = studRegNum;
        this.studName = studName;
        this.studDegree = studDegree;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\n Student1{");
        sb.append("studRegNum=").append(studRegNum);
        sb.append(", studName='").append(studName).append('\'');
        sb.append(", studDegree='").append(studDegree).append('\'');
        sb.append(", hashCode()='").append(this.hashCode()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return studRegNum == student2.studRegNum;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studRegNum);
    }
}
