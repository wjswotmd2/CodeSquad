package This02;

public class HankookTire extends Tire {

    public HankookTire(String loaction, int maxRotation) {
        super(loaction, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumlateRotation;

        if(accumlateRotation < maxRotation) {
            System.out.println(loaction + " HankookTire 수명 " + (maxRotation - accumlateRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + loaction + " HankookTire 펑크 ***");
            System.out.println(number);
            return false;
        }
    }
}
