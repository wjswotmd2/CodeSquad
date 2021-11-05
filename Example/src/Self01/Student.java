package Self01;

public class Student {


    public String name;
    public String department;
    public String no;
    public String score;

    public Student(String name, String department, String no, String score) {
        this.name = name;
        this.department = department;
        this.no = no;
        this.score = score;
    }

    public void show() {
        System.out.println("이름 : " + name);
        System.out.println("학과 : " + department);
        System.out.println("학번 : " + no);
        System.out.println("학점 평균 : " + score);
    }

    public void find() {
        System.out.println(name + "," + department + "," + no + "," + score);
    }

}
