package algorithm02_12_10;

import java.util.Scanner;

public class BaekJoon5543 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ham = 2001;
        int drink = 2001;

        for(int i = 0; i < 3; i++) {
            int money = scan.nextInt();
            if(ham > money) {
                ham = money;
            }
        }

        for(int i = 0; i < 2; i++){
            int money = scan.nextInt();
            if(drink > money) {
                drink = money;
            }
        }

        System.out.println("가장 저렴한 세트 : " + (ham + drink - 50));
    }
}
