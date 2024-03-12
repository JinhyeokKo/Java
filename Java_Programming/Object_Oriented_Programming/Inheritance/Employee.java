package Test;

public class Employee extends Person {
    public Employee() {
        super();
    }

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                "} " + super.toString();
    }
}
