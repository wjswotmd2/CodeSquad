package algorithm02_12_06;

import java.util.Scanner;

public class BaekJonn2588 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        String num2 = scan.next();
        int sum = 0;
        String a = "";
        int i = num2.length();

        while (true) {
            a = String.valueOf(num2.charAt(i-1));
            sum = num1 * Integer.parseInt(a);
            System.out.println(sum);
            i--;
            if(i == 0) {
                System.out.println(num1 * Integer.parseInt(num2));
                break;
            }
        }




    }
}
