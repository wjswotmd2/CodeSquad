package This02;

public class KumhoTire extends Tire {


    public KumhoTire(String loaction, int maxRotation) {
        super(loaction, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumlateRotation;
        if(accumlateRotation < maxRotation) {
            System.out.println(loaction + " KumhoTire 수명 " + (maxRotation - accumlateRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + loaction + " KumhoTire 펑크 ***");
            System.out.println(number);
            return false;
        }
    }
}

