package algorithm02_12_10;

import java.util.Scanner;

public class BaekJoon5893 {

    public static void main(String[] args) {

        
        //백준 사이트내에서는 이렇게 풀이 불가능
        Scanner scan = new Scanner(System.in);

        //이진수 입력받고
        String num = scan.next();
        //2진수를 10진수로 바꿔주면서 17을 곱하고 a 대입
        int a = 17 * Integer.parseInt(num, 2);

        //10진수를 다시 2진수로 바꿔주는 과정
        System.out.println(Integer.toBinaryString(a));
    }
}
