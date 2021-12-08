package algorithm02_12_06;

import java.util.Scanner;

public class BaekJoon2752 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();
        int mid = scan.nextInt();
        int min = scan.nextInt();

        int temp = 0;


        while (true) {
            if(max > mid && max > min) {
                if(mid > min) {
                    break;
                }
                else {
                    temp = mid;
                    mid = min;
                    min = temp;
                    break;
                }
            }
            else if(mid > max && mid > min){
                temp = max;
                max = mid;
                mid = temp;
                if(mid > min) {
                    break;
                }
                else {
                    temp = mid;
                    mid = min;
                    min = temp;
                }
            }
            else if(min > max && min > mid){
                temp = max;
                max = min;
                min = temp;
                if(mid > min) {
                    break;
                }
                else {
                    temp = mid;
                    mid = min;
                    min = temp;
                }
            }
        }


        System.out.println(min + ", " + mid + ", " + max);
    }
}
