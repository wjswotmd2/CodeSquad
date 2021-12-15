package oneStepEx01;

public class MainChick {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            GeneralChick yc = new GeneralChick();
            yc.display();

        }

        System.out.println("=======================================");

        for(int i = 0; i < 2; i++) {
            RedChick rc = new RedChick();
            rc.display();
        }
    }
}
