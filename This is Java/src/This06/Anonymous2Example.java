package This06;

public class Anonymous2Example {
    public static void main(String[] args) {

        Anonymous2 anony = new Anonymous2();

        anony.field.turnOn();

        anony.method1();
        
        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("smartTv를 켭니다");
                
            }

            @Override
            public void turnOff() {
                System.out.println("smartTv를 끕니다");
            }
        });
    }
}
