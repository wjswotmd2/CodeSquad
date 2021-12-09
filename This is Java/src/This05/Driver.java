package This05;

public class Driver {

    public void driver(Vehicle vehicle){
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.chekFare();
        }
        vehicle.run();
    }
}
