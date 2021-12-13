package This08;

import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        
        Student student1 = new Student(1,"홍길동");
        Student student2 = new Student(1,"홍길동");

        System.out.println(student1.hashCode());
        System.out.println(Objects.hashCode(student2));
    }


    static class Student {
        int sno;
        String name;

        public Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }


        @Override
        public int hashCode() {
            return this.sno + this.name.hashCode();
        }
    }
}