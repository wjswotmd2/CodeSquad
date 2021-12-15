package oneStepEx04;

import java.awt.*;

public class GeneralChick extends Chick {
    public static final int MD_SIZE = 30;

    public GeneralChick() {

    }

    public GeneralChick(int xx, int yy) {
        super(xx, yy);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawString("노란병아리", x, y-2);
        g.fillOval(x, y, GeneralChick.MD_SIZE, GeneralChick.MD_SIZE);
    }
}
