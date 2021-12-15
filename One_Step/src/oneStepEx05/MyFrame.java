package oneStepEx05;

import java.awt.*;

public class MyFrame extends Frame {

    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;

    private ChickManager mgr = ChickManager.getInstance();

    public MyFrame() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    public void paint(Graphics g){
        if(mgr != null) {
            mgr.displayAllChicks(g);
            mgr.displayPpick(g);
            mgr.displayFly(g);
        }
    }
}
