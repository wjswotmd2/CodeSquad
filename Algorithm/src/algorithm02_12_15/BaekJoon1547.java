package algorithm02_12_15;

import java.nio.file.Path;
import java.util.Scanner;

public class BaekJoon1547 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();

        boolean[] ball = new boolean[4];

        ball[0] = false;
        ball[1] = true;
        ball[2] = false;
        ball[3] = false;

        for(int i = 0; i < M; i++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            boolean temp;

            temp =  ball[X];
            ball[X] = ball[Y];
            ball[Y] = temp;
        }

        for(int i = 1; i < ball.length; i++) {
            if(ball[i] == true){
                System.out.println(i);
                break;
            }

        }
    }
}
