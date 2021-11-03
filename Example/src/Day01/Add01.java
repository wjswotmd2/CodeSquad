package Day01;

import java.util.Scanner;

public class Add01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String s = scan.next();

        int Sum = 0;

        for(int i = 0; i < num; i++){
            Sum += s.charAt(i) - '0';
        }
        System.out.println("총합 : " + Sum);
    }
}
