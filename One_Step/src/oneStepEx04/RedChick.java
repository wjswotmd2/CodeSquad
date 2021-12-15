package oneStepEx04;

import java.awt.*;

public class RedChick extends Chick {

    public static final int RD_SIZE = 30;

    public RedChick() {
        super();
    }

    public RedChick(int xx, int yy){
        super(xx, yy);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("빨간 병아리", x, y-2);
        g.fillOval(x, y, RedChick.RD_SIZE, RedChick.RD_SIZE);
    }
}
