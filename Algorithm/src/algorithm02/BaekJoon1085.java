package algorithm02;

import java.util.Scanner;

public class BaekJoon1085 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();  //가로축
        int y = scan.nextInt();  //세로축
        int w = scan.nextInt();  //가로
        int h = scan.nextInt();  //세로

        int min_x = Math.min(x, w-x);
        int min_y = Math.min(y, h-y);

        System.out.println(Math.min(min_x, min_y));


    }
}
