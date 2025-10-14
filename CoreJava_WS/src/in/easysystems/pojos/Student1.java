package in.easysystems.pojos;

// Without equals() and hashcode()
public class Student1 {

    int studRegNum;
    String studName;
    String studDegree;

    public Student1(int studRegNum, String studName, String studDegree) {
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
}
