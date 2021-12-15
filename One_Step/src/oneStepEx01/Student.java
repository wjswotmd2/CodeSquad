package oneStepEx01;

public class Student {
    int hakbun;
    String name;
    int kor;
    int eng;
    int math;
    int total;

    public Student(int hakbun, String name, int kor, int eng, int math) {
        this.hakbun = hakbun;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int calcTotal() {
        total = kor + eng + math;
        return total;
    }
}
