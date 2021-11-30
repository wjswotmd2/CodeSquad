package Pratice07;

public class CalcTest {

    public static void main(String[] args) {

        Calc c = (s1, s2) -> { return s1 + s2;
        };

        System.out.println(c.add(10 ,20));
    }
}
