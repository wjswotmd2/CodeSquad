package algorithm02_12_13;

import java.util.Scanner;

public class BaekJoon10156 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int K = scan.nextInt();
        int N = scan.nextInt();
        int M = scan.nextInt();

        if(K * N < M) {
            System.out.println(0);
        }
        else {
            System.out.println((K * N) - M);
        }
    }
}
