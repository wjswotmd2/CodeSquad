package algorithm02_12_15;

import java.util.Scanner;

public class BaekJoon10768 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        int day = scan.nextInt();

        if(month < 1) {
            System.out.println("Before");
        }
        else if(month > 3) {
            System.out.println("After");
        }
        else {
            if(day < 17) {
                System.out.println("Before");
            }
            else if(day > 18) {
                System.out.println("After");
            }
            else {
                System.out.println("Special");
            }
        }
    }
}
