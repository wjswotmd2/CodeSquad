package algorithm02_12_05;

import java.util.Scanner;

public class BaekJoon2480 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        System.out.println(A  + "," + B + "," + C);

        if(A == B && B == C) {
            System.out.println(10000 + (A * 1000));
        }
        else if((A == B || A == C) || (B == C || C == A)){
            System.out.println(1000 + (A == B ? A * 100 : B * 100)) ;
        }
        else {
            if(A > B && A > C){
                System.out.println(A * 100);
            }
            else if(B > A && B > C) {
                System.out.println(B * 100);
            }
            else {
                System.out.println(C * 100);
            }
        }


    }
}
