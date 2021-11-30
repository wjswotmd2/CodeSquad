package Pratice04;

class Outer2 {
    Runnable getRunnalble(int i) {
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);
            }
        };
    }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable이 구현된 익명 클래스 변수");
            }
        };
    }


public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runnable = out.getRunnalble(10);
        runnable.run();
        out.runnable.run();
    }
}
