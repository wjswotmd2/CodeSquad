package This08;

public class NewInstanceExample {
    public static void main(String[] args) {

        try {
//            Class clazz = Class.forName("This08.SendAction");
            Class clazz = Class.forName("This08.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
