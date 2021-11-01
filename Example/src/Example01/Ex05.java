package Example01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();

        if((H >= 0 && H < 24) || (M > 0 && M < 60)){
                if (H == 0) {
                    H = 24;
                }
                    if (M < 45) {
                        H--;
                        M = 60 - (45 - M);
                    } else {
                        M = M - 45;
                    }

        }
        System.out.println(H +"시 " + M + "분");
    }
}
