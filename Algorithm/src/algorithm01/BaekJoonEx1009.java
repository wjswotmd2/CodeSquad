package algorithm01;

import java.util.Scanner;

public class BaekJoonEx1009 {

    public void forRe(int[] arr) {
        for(int i = 0 ; i < arr.length; i++) {

        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum[] = new int[num];

        for(int i = 0; i < sum.length; i++){

            double a = scan.nextDouble();
            double b = scan.nextDouble();
            b = b % 4;
            if(b == 0) {
                b += 4;
            }
            sum[i] = (int)Math.pow(a , b) % 1000;

        }


        for(int i = 0; i < sum.length; i++) {
            System.out.println(sum[i] % 10);
        }




    }
}
