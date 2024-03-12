package Test;

public class Student extends Person {
    public Student() {
        super();
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }
}
