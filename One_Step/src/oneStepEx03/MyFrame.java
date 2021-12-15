package oneStepEx03;

import java.awt.*;

public class MyFrame extends Frame {

    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;

    private static final int NUMCOUNT = 10;
    MyShape[] arr = new MyShape[NUMCOUNT];

    public MyFrame() {
        super();
        makeShapes();
        setBounds(200, 100, FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }

    public void makeShapes() {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new MyShape();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        if(arr != null) {
            for(MyShape temp : arr) {
                if(temp != null) {
                    temp.display(g);
                }
            }
        }
    }
}
