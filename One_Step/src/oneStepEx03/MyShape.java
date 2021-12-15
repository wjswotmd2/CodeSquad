package oneStepEx03;

import oneStepEx03.MyFrame;

import java.awt.*;
import java.util.Random;

public class MyShape {

    private int cx;
    private int cy;

    private static int count = 0;
    public final int num;

    public static final int SHAPE_SIZE = 30;

    public MyShape() {
        Random rnd = new Random();
        cx = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
        cy = rnd.nextInt(MyFrame.FRAME_HEIGHT - 100) + 50;
        num = ++count;
    }

    public MyShape(int x, int y) {
        Random rnd = new Random();
        cx = x;
        cy = y;

        num = ++count;
    }

    public int getCx() {
        return cx;
    }

    public int getCy() {
        return cy;
    }

    public void display(Graphics g) {
        g.drawString(num + "", cx, cy-2);
        g.fillOval(cx, cy, SHAPE_SIZE, SHAPE_SIZE);
    }
};
