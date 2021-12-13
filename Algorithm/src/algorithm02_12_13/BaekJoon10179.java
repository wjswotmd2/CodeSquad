package algorithm02_12_13;

import java.util.Scanner;

public class BaekJoon10179 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        double[] price = new double[num];


        for(int i = 0 ; i < price.length; i++) {
            price[i] = scan.nextDouble();
        }

        for(int i = 0; i < price.length; i++) {
            System.out.printf("$ %.2f \n", (price[i] - price[i] * 0.2));
        }
    }
}
