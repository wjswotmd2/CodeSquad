package algorithm02_12_06.algorithm02_12_05;

import java.util.Scanner;
public class BaekJoon1267 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();

        int[] numArr = new int[Num];
        int sumY = 0;
        int sumM = 0;


        for(int i = 0; i < numArr.length; i++){
            numArr[i] = scan.nextInt();
            sumM += (numArr[i] / 30 + 1) * 10;
            sumY += (numArr[i] / 60 + 1) * 15;
        }


        if (sumY == sumM) {
            System.out.println("Y M " + sumM);
        }
        else if(sumY > sumM) {
            System.out.println("M " + sumM);
        }
        else {
            System.out.println("Y " + sumY);
        }



    }
}
