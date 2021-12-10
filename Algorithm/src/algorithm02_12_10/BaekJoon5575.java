package algorithm02_12_10;

import java.util.Scanner;

public class BaekJoon5575 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] S = new int[4];
        int[] T = new int[4];
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < S.length; i++) {
            S[i] = scan.nextInt();
            sum1 += S[i];
        }

        for(int i = 0; i < T.length; i++) {
            T[i] = scan.nextInt();
            sum2 += T[i];
        }

        if (sum1 > sum2) {
            System.out.println(sum1);
        }
        else {
            System.out.println(sum2);
        }
    }
}
