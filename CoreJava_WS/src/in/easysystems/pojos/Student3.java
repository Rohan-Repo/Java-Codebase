package in.easysystems.pojos;

import java.util.Objects;

public class Student3 implements Comparable<Student3> {

    int studRegNum;
    String studName;
    String studDegree;

    public String getStudName() {
        return studName;
    }

    public String getStudDegree() {
        return studDegree;
    }

    public Student3(int studRegNum, String studName, String studDegree) {
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
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student2 = (Student3) o;
        return studRegNum == student2.studRegNum;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studRegNum);
    }

    @Override
    public int compareTo(Student3 studToCompare) {
        // If return Value Positive then Current Student Value Greater
        // If return Value Negative then studToCompare Value Greater
        // If return Value Equal then Both the Objects are same
        return this.studRegNum - studToCompare.studRegNum;
    }
}
