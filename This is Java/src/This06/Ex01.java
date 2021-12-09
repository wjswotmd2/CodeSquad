package This06;

public class Ex01 {

    int i = 0;


    public void method1(int num, final int num2) {

        final int a = 10;
        int b = 10;

//        num2 = 100;
        i = 100;

        int sum = num + num2 + i + a + b;

        System.out.println(sum);

        Calculatable c = new Calculatable() {
            @Override
            public int sum() {
                int sum = num + num2 + i + a + b;
                return sum;
            }
        };
        System.out.println(c.sum());

    }

    public static void main(String[] args) {

        Ex01 e = new Ex01();

        e.method1(5, 10);
    }
}
