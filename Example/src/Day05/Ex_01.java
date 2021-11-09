package Day05;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("사용자 이름을 입력해주세요>>");
        String name = scan.next();
        int basicMoney = 100;

        int randNum = (int)(Math.random() * 20) + 1;

        System.out.print("홀 또는 짝을 정하고 배팅해주세요(내가 가진 돈보다 큰배팅 불가능)>>");
        String my = scan.next();


        while (true) {
            int batingMoney = scan.nextInt();
            if(basicMoney < batingMoney) {
                continue;
            }

            for(int i = 1; i < 9; i++) {
            if(randNum % 2 == 0) {
                if(my.equals("짝")) {
                    basicMoney += batingMoney;
                }
                else {
                    basicMoney -= batingMoney;
                    if(basicMoney <= 0) {

                    }
                }
            }

            }


        }
    }

}
