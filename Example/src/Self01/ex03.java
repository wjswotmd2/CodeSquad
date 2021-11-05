package Self01;

import java.util.HashMap;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();

        System.out.println("나라 이름과 인구를 입력하세요(ex : 한국 5000)");

        while (true) {
            String nation = scan.next();
            if (nation.equals("그만")) {
                break;
            }
            int pnum = scan.nextInt();
            nations.put(nation, pnum);
        }

        while (true) {
            System.out.println("인구 검색>>");
            String nation = scan.next();

            if (nation.equals("그만")) {
                break;
            }
//          int 로 받으면 nullPointException 발생
            Integer num = nations.get(nation);

            if (num == null) {
                System.out.println(nation + " 나라는 없습니다.");

            } else {
                System.out.println(nation + " 의 인구는 " + num);

            }
        }
    }
}
