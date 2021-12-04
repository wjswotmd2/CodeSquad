package This02;

public class Tire {
    public int maxRotation;
    public int accumlateRotation;
    public String loaction;
    public int number;

    public Tire(String loaction, int maxRotation) {
        this.loaction = loaction;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accumlateRotation;
        if(accumlateRotation < maxRotation) {
            System.out.println(loaction + " Tire 수명 " + (maxRotation - accumlateRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + loaction + " Tire 펑크 ***");
            return false;
        }
    }
}
