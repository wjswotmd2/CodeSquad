package Day04;

import java.util.Scanner;

public class No2438 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        for(int i = 0; i < input; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
