package This01;

public class thisEx01 {
    public static void main(String[] args) {

        while (true) {
            int x = (int)(Math.random() * 6) + 1;
            int y = (int)(Math.random() * 6) + 1;

            System.out.println("(" + x + ", " + y +")");
            if(x + y == 5) {
                break;
            }
        }

        System.out.println();


        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++){
                if((4 * x) + (5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }

        System.out.println();


        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
