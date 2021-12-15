package oneStepEx02;

class MyManager {
    private int score;
    private static MyManager mgr;

    private MyManager(int score) {
        this.score = score;
    }

    public static MyManager getInstance() {
        if(mgr == null) {
            mgr = new MyManager(10);
        }

        return mgr;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class Ex10_17 {
    public static void main(String[] args) {

        MyManager mgrobj = MyManager.getInstance();

        System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
        mgrobj.setScore(100);
        System.out.println("mgrobj.getScore() : " + mgrobj.getScore());

        MyManager newMgr = MyManager.getInstance();
        System.out.println("newMgr.getScore() : " + newMgr.getScore());

    }
}
