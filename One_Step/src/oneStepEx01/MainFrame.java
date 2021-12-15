package oneStepEx01;

public class MainFrame {
    public static void main(String[] args) {

        Student s1 = new Student(1, "홍길동", 25,34,56);
        Student s2 = new Student(1, "김길동", 56,78,34);
        Student s3 = new Student(1, "이길동", 78,56,78);


        System.out.println(s1.name + " = " + s1.calcTotal());
        System.out.println(s2.name + " = " + s2.calcTotal());
        System.out.println(s3.name + " = " + s3.calcTotal());
    }
}
