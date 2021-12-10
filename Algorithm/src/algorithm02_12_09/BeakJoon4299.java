package algorithm02_12_09;

import java.util.Scanner;

public class BeakJoon4299 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score1 = scan.nextInt();
        int score2 = scan.nextInt();
        int n = 0;
        int m = 0;

        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                if (i + j == score1 && i - j == score2) {
                    n = i;
                    m = j;
                }
            }
        }
        if (n > m) {
            System.out.println(n + " " + m);
        } else if (m > n) {
            System.out.println(m + " " + n);
        } else {
            System.out.println(-1);
        }

    }
}