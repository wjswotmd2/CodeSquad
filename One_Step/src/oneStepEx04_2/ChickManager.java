package oneStepEx04_2;

import oneStepEx04.GeneralChick;

import java.awt.*;

public class ChickManager {

    private static ChickManager instance = new ChickManager();

    private GeneralChick[] marr = new GeneralChick[4];
    private RedChick[] rarr = new RedChick[2];

    private ChickManager() {
        makeChicks();
    }

    private void makeChicks() {
        if(marr != null) {
            for(int i = 0; i < marr.length; i++) {
                marr[i] = new GeneralChick();
            }
        }
        if(rarr != null) {
            for(int i = 0; i < rarr.length; i++) {
                rarr[i] = new RedChick();
            }
        }
    }

    public static ChickManager getInstance() {
        if(instance == null) {
            instance = new ChickManager();
        }
        return instance;
    }

    public void diplayAllChicks(Graphics g) {
        if(marr != null) {
            for(int i = 0; i < marr.length; i++) {
                marr[i].display(g);
            }
        }
        if(rarr != null) {
            for(int i = 0; i < rarr.length; i++) {
                rarr[i].display(g);
            }
        }
    }

    public void ppick(Graphics g) {};
    public void walk(Graphics g) {};
}
