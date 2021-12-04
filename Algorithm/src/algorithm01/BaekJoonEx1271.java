package algorithm01;

import java.util.Scanner;

public class BaekJoonEx1271 {

    int money;
    int n;

    public int division(int money, int n) {
        if(n < 0) {
            return 0;
        }
        return money / n;
    }

    public int quotient(int money, int n) {
        return money % n;
    }

    public static void main(String[] args) {

        BaekJoonEx1271 b = new BaekJoonEx1271();

        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int num = scan.nextInt();

        System.out.println(b.division(money, num));
        System.out.println(b.quotient(money, num));
    }
}
