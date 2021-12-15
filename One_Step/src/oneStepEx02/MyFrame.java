package oneStepEx02;

import java.awt.*;

public class MyFrame extends Frame {
    MyFrame() {
        this.setSize(500,400);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(100,100,50,50);
    }
}
