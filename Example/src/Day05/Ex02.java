package Day05;

import java.util.ArrayList;
import java.util.Scanner;

class Day {
    int Day;
    String s;
    int addMoney;
    int minusMoney;

    public Day(int day, String s, int addMoney, int minusMoney) {
        Day = day;
        this.s = s;
        this.addMoney = addMoney;
        this.minusMoney = minusMoney;
    }
}

public class Ex02 {
    Scanner scan = new Scanner(System.in);
    String id;
    String password;

    public static void main(String[] args) {

        Ex02 ex = new Ex02();
        Scanner scan = new Scanner(System.in);
        System.out.print("사용할 아이디를 입력해주세요>>");
        ex.id = scan.next();
        System.out.print("사용할 비밀번호를 입력해주세요>>");
        ex.password = scan.next();

        ArrayList<Day> homeMoney = new ArrayList<>();

        System.out.print("아이디를 입력해주세요>>");
        String id = scan.next();
        System.out.print("비밀번호를 입력해주세요>>");
        String pass = scan.next();


            while (true) {
                if (ex.id.equals(id) && ex.password.equals(pass)) {
                System.out.println("가계부 프로그램을 시작합니다");
                System.out.println("1.데이터 입력 || 2.가계부 삭제 || 3 가계부 수정 || 4 가계부 출력");
                int num = scan.nextInt();
                if (num == 1) {
                    System.out.println("가계부 작성 날짜를 입력해주세요(ex>> 20210801)");
                    int day = scan.nextInt();
                    System.out.println("구입 물품을 입력해주세요");
                    String s = scan.next();
                    System.out.println("수입을 입력해주세요");
                    int addMoney = scan.nextInt();
                    System.out.println("지출을 입력해주세요");
                    int minusMoney = scan.nextInt();
                    homeMoney.add(new Day(day, s, addMoney, minusMoney));
                } else if (num == 2) {
                    System.out.println("삭제할 날짜를입력해주세요 (ex>> 20210801)");
                    int day = scan.nextInt();
                    for(int i = 0; i < homeMoney.size(); i++) {
                        if(homeMoney.get(i).Day == day) {
                            homeMoney.remove(i);
                        }
                    }
                } else if (num == 3) {
                    System.out.print("수정할 데이터를 날짜입력해주세요 (ex> 20210801)");
                    int day = scan.nextInt();
                    for(int i = 0 ; i < homeMoney.size(); i++) {
                        if(day == homeMoney.get(i).Day) {
                            System.out.println("수정하고싶은 목록을 선택해주세요");
                            System.out.println("1.날짜 || 2.구입물품 || 3.수입 || 4.지출금액");
                            int number = scan.nextInt();
                            if (number == 1) {
                                System.out.println("날짜를 변경해주세요 (ex> 20210801)");
                                homeMoney.get(i).Day = scan.nextInt();
                            }
                            else if(number == 2) {
                                System.out.println("구입 물품을 변경해주세요");
                                homeMoney.get(i).s = scan.next();
                            }
                            else if(number == 3) {
                                System.out.println("수입을 변경해주세요");
                                homeMoney.get(i).addMoney = scan.nextInt();
                            }
                            else if(number == 4) {
                                System.out.println("지출을 변경해주세요");
                                homeMoney.get(i).minusMoney = scan.nextInt();
                            }
                            else {
                                System.out.println("번호를 잘못 입력했습니다");
                            }
                        }
                    }

                } else if (num == 4) {
                    System.out.print("NO    날짜        지출목록        수입목록       지출금액");
                    System.out.println();
                    for (int i = 0; i < homeMoney.size(); i++) {
                        System.out.print("("+ (i+1+")  ") + homeMoney.get(i).Day + "     "
                                + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                "        " + homeMoney.get(i).minusMoney + "\n");
                    }
                    System.out.println("============================================================");
                    int addSum =0;
                    int minusSum = 0;

                    for(int i = 0; i < homeMoney.size(); i++) {
                        addSum += homeMoney.get(i).addMoney;
                        minusSum += homeMoney.get(i).minusMoney;
                    }

                    System.out.println("                               총수입       총지출       남은금액");
                    System.out.println("                                " + addSum + "      " + minusSum + "        " + (addSum - minusSum));


                    addSum = 0;
                    minusSum = 0;

                } else {
                    System.out.println("번호를 잘못 입력하셨습니다.");
                }

            }else {
                    System.out.println("아이디 또는 비밀번호가 다릅니다 다시 입력해주세요");
                    System.out.print("아이디를 입력해주세요>>");
                    id = scan.next();
                    System.out.print("비밀번호를 입력해주세요>>");
                    pass = scan.next();
                }
        }

    }
}
