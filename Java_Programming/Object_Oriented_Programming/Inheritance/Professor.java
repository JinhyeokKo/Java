package Test;

public class Professor extends Person {

    public Professor() {
        super();
    }

    public Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
