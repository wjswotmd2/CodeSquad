package algorithm02;

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon2338 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //BigInteger를 사용해 aad,subtract, multiply 메서드 사용
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();


        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
