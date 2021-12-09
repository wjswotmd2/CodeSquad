package This06;

public class AnonymousExample {

    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();

        anonymous.field.wake();

        System.out.println("=========================");

        anonymous.method1();

        System.out.println("=========================");

        anonymous.method2(new Person(){
            void study() {
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });


    }
}
