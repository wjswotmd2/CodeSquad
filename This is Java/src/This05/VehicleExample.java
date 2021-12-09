package This05;

public class VehicleExample {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();

        vehicle.run();

        //사용 불가
//        vehicle.checkFare();

        System.out.println("===============");

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.chekFare();
    }
}
