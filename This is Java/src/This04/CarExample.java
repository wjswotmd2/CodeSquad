package This04;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.run();

        System.out.println("========================");

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();

        System.out.println("=======================================================");

        Car myCars = new Car();

        myCars.runs();

        System.out.println("===========================");

        myCars.tires[0] = new KumhoTire();
        myCars.tires[1] = new KumhoTire();

        myCars.runs();

        System.out.println("===========================");
    }
}
