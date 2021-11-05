package Self01;

import java.util.Scanner;
import java.util.Vector;

public class ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();


        while(true) {
            System.out.println("강수량 입력 (0 입력시 종료) >>");
            int input = scan.nextInt();


            if (input == 0) {
                break;
            }
            v.add(input);
//          내가 틀린부분 이곳에서 sum을 다시 0으로 초기화 해줌으로서
//          밑의 sum += data에서 처음부터 다시 더해짐(위치중요)
            int sum = 0;
            for(int i = 0; i < v.size(); i++) {
                int data = v.get(i);
                System.out.print(data + " ");
                sum += data;
            }
            System.out.println();

            System.out.println("현재 평균 : " + sum / v.size());








        }
    }
}
