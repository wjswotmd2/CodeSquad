package Day03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] name = new String[]{"호두마루", "mong", "meatsby", "Shion", "Dave", "BC", "Barney", "OS", "Dike", "Jun"};

        System.out.println("몇 명인가요?");
        int number = scan.nextInt();
        int[] num = new int[number];


        for (int i = 0; i < number; i++) {
            int random = (int) (Math.random() * 10);
            num[i] = random;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println(name[i]);
        }

    }

}




