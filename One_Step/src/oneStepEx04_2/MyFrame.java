package oneStepEx04_2;


import java.awt.*;

public class MyFrame extends Frame {

    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;

    private ChickManager mgr= ChickManager.getInstance();

    private GeneralChick[] marr = new GeneralChick[4];
    private RedChick[] rarr = new RedChick[2];

    public MyFrame() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        if(mgr != null) {
            mgr.diplayAllChicks(g);
        }
    }
}
