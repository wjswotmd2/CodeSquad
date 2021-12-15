package oneStepEx01;

import java.util.Random;

public class RedChick {
    int x;
    int y;

    public RedChick() {
        Random rnd = new Random();
        this.x = rnd.nextInt(500);
        this.y = rnd.nextInt(400);
    }

    public RedChick(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("빨간 병아리");
        System.out.println(this.toString());
    }
    public void walk() {

    }
    public void ppick() {

    }

    @Override
    public String toString() {
        return "빨간 병아리 위치 : " +
                "x=" + x +
                ", y=" + y;
    }
}
