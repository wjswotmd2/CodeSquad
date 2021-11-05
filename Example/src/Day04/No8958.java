package Day04;

import java.util.Scanner;

public class No8958 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String str = "";
        int sum = 0;
        int count = 0;
        String[] sArr = new String[input];

        for(int i = 0; i < sArr.length; i++) {
            sArr[i] = scan.next();
        }

        for (int i = 0; i < sArr.length; i++) {
            str = sArr[i];
            sum = 0;
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                char OX = str.charAt(j);
                if (OX == 'O') {
                    count++;
                    sum += count;
                } else if (OX == 'X') {
                    count = 0;
                }

            }
            System.out.println(sum);
            str = "";
        }



    }
}
