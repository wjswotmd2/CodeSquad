package This06;

public class NestedClassExample {

    public static void main(String[] args) {

        Car car = new Car();


        //헷갈리니 잘기억해놓자
        Car.Tire tire = car.new Tire();

        Car.Engine engine = new Car.Engine();
    }
}
