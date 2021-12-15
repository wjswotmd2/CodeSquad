package algorithm02_12_15;

import java.util.Scanner;

public class BaekJoon10707 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int P = scan.nextInt();


        if ((A * P) < B) {
            System.out.println(A * P);

        } else if ((A * P) > (B + ((P - C) * D))) {
            System.out.println((B + ((P - C) * D)));

        } else {
            System.out.println(B);
        }


    }
}
