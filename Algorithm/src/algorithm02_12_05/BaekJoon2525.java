package algorithm02_12_05;

import java.util.Scanner;

public class BaekJoon2525 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();


//        if ((A >= 0 && A <= 23) && (B >= 0 && B <= 59)) {
            B += C;
            while (true) {
               if(B >= 60) {
                   A++;
                   if(A > 23) {
                       A = 0;
                   }
                   B -= 60;
               } else {
                   break;
               }



            }
        System.out.println(A + " " + B);
    }
}
