package Self01;

import java.util.Scanner;
import java.util.Vector;

public class ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        int num = 0;
        System.out.print("정수(-1이 입력될 때까지)>>");

        while(true) {
            num = scan.nextInt();
            if(num == -1) {
                break;
            }
            v.add(num);
        }
        int max = v.get(0);

        for(int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.print(n + " ");
            if(max < v.get(i)) {
                max = v.get(i);
            }

        }

        System.out.println("가장 큰수 : " + max);
    }
}
