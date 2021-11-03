package Day01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("윤년 판별기(년도를 입력해주세요)>>");
        int year = scan.nextInt();

        if(year >= 1 && year <= 4000) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }else {
            System.out.println("입력 년도가 범위를 초과했습니다.");
        }
    }
}
