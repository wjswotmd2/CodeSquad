package algorithm02_12_09;

import java.util.Scanner;

public class BeakJoon5532 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int korpage = scan.nextInt();
        int mathpage = scan.nextInt();
        int maxkor = scan.nextInt();
        int maxMath = scan.nextInt();


        if(korpage / maxkor > mathpage / maxMath) {
            System.out.println(day - (korpage % maxkor == 0 ? korpage / maxkor : (korpage / maxkor) + 1 ));
        }
        else {
            System.out.println(day - (mathpage % maxMath == 0 ? mathpage / maxMath : (mathpage / maxMath) + 1 ));
        }

    }
}
