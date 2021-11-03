package Day01;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("구구단의 시작단 >>");
        int start = scan.nextInt();
        System.out.print("구구단의 끝단 >>");
        int end = scan.nextInt();

        for(int i = 1; i <= 9; i++) {
            for(int j = start; j <= end; j++) {
                System.out.print(j + " X " + i + " = " + i * j + "\t");
            }
            System.out.println();

        }
    }
}
