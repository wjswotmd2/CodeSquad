package oneStepEx04;


import java.awt.*;

public class MyFrame extends Frame {

    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;

    private GeneralChick[] marr = new GeneralChick[4];
    private RedChick[] rarr = new RedChick[2];

    public MyFrame() {
        makeChicks();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    private void makeChicks() {
        if(marr != null) {
            for(int i = 0; i < marr.length; i++) {
                marr[i] = new GeneralChick();
            }
        }

        if(rarr != null) {
            for(int i = 0; i < rarr.length; i++){
                rarr[i] = new RedChick();
            }
        }
    }

    public void paint(Graphics g){
        if(marr != null) {
            for(int i = 0; i < marr.length; i++){
                if(marr[i] != null){
                    marr[i].display(g);
                }
            }
        }
        if(rarr != null) {
            for(int i = 0; i < rarr.length; i++){
                if(rarr[i] != null){
                    rarr[i].display(g);
                }
            }
        }
    }
}
