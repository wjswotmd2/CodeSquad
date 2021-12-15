package oneStepEx04;

import java.awt.*;
import java.util.Random;

public class Chick {

    protected int x;
    protected int y;

    public Chick() {
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
    }

    public Chick(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display(Graphics g) {
        g.fillOval(x, y, 0, 0);
    }

    public void ppick(Graphics g) {};
    public void walk(Graphics g) {};
}
