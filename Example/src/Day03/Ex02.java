package Day03;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String m = null;
        String d = null;
        String[] year = new String[]{"시끄러운", "푸른", "적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심많은"};
        String[] month = new String[]{"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람"};
        String[] day = new String[]{"와 함께 춤을", " 의 기상", "은(는) 그림자속에", "없음", "없음", "없음", "의 환생", "의 죽음", "아래에서", "를(을)보라", "이(가) 노래하다",
                "그림자", "의 일격", "에게 쫒기는 남자", "의 행진", "의 왕", "의 유령", "을 죽인자.", "는(은) 맨난 잠잔다", "처럼", "의 고향",
                "의 전사", "은(는) 나의친구", "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "를(을) 쓰러트린자", "의 혼", "은(는) 말이없다"};
        System.out.println("생년월일을 입력해 주세요>>");
        String str = scan.nextLine();

        System.out.println(str.length());


            String y = year[str.charAt(3) - '0'];
            if (str.charAt(5) - '0' == 1 && str.charAt(6) != ' ') {
                String sta = "" + ((str.charAt(5) - '0') + "" + ((str.charAt(6)) - '0'));
                int mon = Integer.parseInt(sta);
                m = month[mon - 1];
            } else {
                int num = str.charAt(5) - '0';
                m = month[num];
            }

                if(str.length() == 8) {
                    int n = str.charAt(7) - '0';
                    d = day[n - 1];
                }

                if(str.length() == 9) {
                    String st = (str.charAt(7) - '0') + "" + (str.charAt(8) - '0');
                    int n = Integer.parseInt(st);
                    d = day[n];
                }


        System.out.println(y + " " + m + " " + d);

        }
    }

