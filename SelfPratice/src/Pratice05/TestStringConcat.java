package Pratice05;

public class TestStringConcat {
    public static void main(String[] args) {

        //일반 인터페이스 상속후 구현후 실행
        StringConcatImple s = new StringConcatImple();

        String s1 = "전재승";
        String s2 = "천재";

        s.makeString(s1, s2);

        
        //람다 구현
        StringConcat sc = (q ,v) -> System.out.println(q.concat(v));

        sc.makeString(s1, s2);
    }
}
