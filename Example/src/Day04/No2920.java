package Day04;

import java.util.Scanner;

public class No2920 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = new int[8];
        String str = "";

        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
        }

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1] - 1) {
                str = "ascending";
            } else if (input[i] == input[i + 1] + 1) {
                str = "descending";
            } else {
                str = "mixed";
            }
        }


        System.out.println(str);

    }
}
