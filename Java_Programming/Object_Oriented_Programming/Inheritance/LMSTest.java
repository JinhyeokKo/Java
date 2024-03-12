package Test;

public class LMSTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        Professor p = new Professor();
        Student s = new Student();

        e.setName("오정임");
        e.setAge(47);
        e.setDept("입학처");

        p.setName("김푸름");
        p.setAge(52);
        p.setSubject("빅데이터");

        s.setName("김유빈");
        s.setAge(20);
        s.setMajor("컴퓨터과학");

        System.out.println(e);
        System.out.println(p);
        System.out.println(s);

        Employee e2 = new Employee("김성호", 45, "사무처");
        Professor p2 = new Professor("이수연", 37, "정보보안");
        Student s2 = new Student("박수진", 23, "AI공학");

        System.out.println(e2);
        System.out.println(p2);
        System.out.println(s2);
    }
}
