package algorithm02_12_08;

import java.util.Scanner;

public class BaekJoon2530 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        if ((A >= 0 && A <= 23) && (B >= 0 && B <= 59) && (C >= 0 && C <= 59)) {

            while (true) {

                C = C + (D % 60);
                if (C > 59) {
                    B++;
                }
                B = B + (D / 60);

                A = A + (B / 60);
                if (A % 24 == 0) {
                    A = 0;
                }
                A = A % 24;
                B = B % 60;
                C = C % 60;

                break;
            }


        }
        System.out.println(A + " : " + B + " : " + C);
    }


}







