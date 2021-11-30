package Pratice03;

import java.util.HashSet;
import java.util.Objects;

class Student {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Student) {
           Student s = (Student)obj;
           if(id.equals(s.id)) {
               return true;
           }
       }
       return false;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(id);
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class StudentTest {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<Student>( );

        set.add(new Student("100", "홍길동"));
        set.add(new Student("200", "강감찬"));
        set.add(new Student("300", "이순신"));
        set.add(new Student("400", "정약용"));
        set.add(new Student("100", "송중기"));

        System.out.println(set);
    }

}
