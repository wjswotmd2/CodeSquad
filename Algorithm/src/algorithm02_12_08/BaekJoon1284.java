package algorithm02_12_08;

import java.util.Scanner;

public class BaekJoon1284 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (true) {

            String N = scan.next();

            if (N.equals("0")) {
                break;
            }
            for (int i = 0; i < N.length(); i++) {
                sum++;
                if (N.charAt(i) == '1') {
                    sum += 2;
                } else if (N.charAt(i) == '0') {
                    sum += 4;
                } else {
                    sum += 3;
                }
                if (N.length() - 1 == i) {
                    sum++;
                }


            }
            System.out.println("sum : " + sum);
            sum = 0;



        }

    }
}
