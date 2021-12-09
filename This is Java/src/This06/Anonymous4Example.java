package This06;

public class Anonymous4Example {

    public static void main(String[] args) {

        Anonymous4 anony = new Anonymous4();

        anony.field.run();

        anony.method1();

        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });
    }
}
