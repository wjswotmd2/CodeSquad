package This04;

public class Car {

    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    void runs() {
        for(Tire tire : tires) {
            tire.roll();
        }
    }

    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire baakLeftTire = new HankookTire();
    Tire bakcRightTire = new HankookTire();

    void run() {
        frontLeftTire.roll();
        frontLeftTire.roll();
        baakLeftTire.roll();
        bakcRightTire.roll();
    }

}
