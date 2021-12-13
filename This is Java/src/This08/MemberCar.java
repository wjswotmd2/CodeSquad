package This08;

import java.util.Arrays;

public class MemberCar implements Cloneable{

    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public MemberCar(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    protected Object clone() throws CloneNotSupportedException {
        MemberCar cloned = (MemberCar) super.clone();

        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);

        cloned.car = new Car(this.car.model);

        return cloned;
    }

    public MemberCar getMemberCar(){
        MemberCar cloned = null;
        try {
            cloned = (MemberCar) clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
