package Self01;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Character> c = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            char input = scan.next().charAt(0);
            System.out.println(input + " ");
            c.add(input);
        }

        System.out.println(c.size());

        double sum = 0;

        for (int i = 0; i < c.size(); i++) {
            char ch = c.get(i);
            switch (ch) {
                case 'A':
                    sum += 4.0;
                    break;
                case 'B':
                    sum += 3.0;
                    break;
                case 'C':
                    sum += 2.0;
                    break;
                case 'D':
                    sum += 1.0;
                    break;
                case 'F':
                    sum += 0.0;
                    break;
                default:
                    System.out.println("범위 초과");
                    return;
            }


        }
        sum = sum / c.size();
        System.out.println("평균 : " + sum);

    }

}
