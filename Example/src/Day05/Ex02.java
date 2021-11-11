package Day05;

import java.util.ArrayList;
import java.util.Scanner;

class Day {
    String Day;
    String s;
    int addMoney;
    int minusMoney;
    String pay;

    public Day(String day, String s, int addMoney, int minusMoney, String pay) {
        Day = day;
        this.s = s;
        this.addMoney = addMoney;
        this.minusMoney = minusMoney;
        this.pay = pay;
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

        ArrayList<Day> homeMoney = new ArrayList<>(10);

        System.out.println(homeMoney.size());

        System.out.print("아이디를 입력해주세요>>");
        String id = scan.next();
        System.out.print("비밀번호를 입력해주세요>>");
        String pass = scan.next();


            while (true) {
                if (ex.id.equals(id) && ex.password.equals(pass)) {
                System.out.println("가계부 프로그램을 시작합니다");
                System.out.println("1.데이터 입력 || 2.가계부 삭제 || 3.가계부 수정 || 4.가계부 출력 || 5.가계부 검색");
                int num = scan.nextInt();
                scan.nextLine();
                if (num == 1) {
                    System.out.println("가계부 작성 날짜를 입력해주세요(ex>> 2021 08 01)");
                    String day = scan.nextLine();
                    System.out.println("구입 물품을 입력해주세요");
                    String s = scan.nextLine();
                    System.out.println("수입을 입력해주세요");
                    int addMoney = scan.nextInt();
                    System.out.println("지출을 입력해주세요");
                    int minusMoney = scan.nextInt();
                    scan.nextLine();
                    System.out.println("결제 수단을 선택해 주세요");
                    String pay = scan.nextLine();
                    homeMoney.add(new Day(day, s, addMoney, minusMoney, pay));
                } else if (num == 2) {
                    System.out.println("삭제할 날짜를입력해주세요 (ex>> 20210801)");
                    String day = scan.nextLine();
                    for(int i = 0; i < homeMoney.size(); i++) {
                        if(homeMoney.get(i).Day == day) {
                            homeMoney.remove(i);
                        }
                    }
                } else if (num == 3) {
                    System.out.print("수정할 데이터를 날짜입력해주세요 (ex> 2021 08 01)");
                    String day = scan.next();
                    for(int i = 0 ; i < homeMoney.size(); i++) {
                        if(day == homeMoney.get(i).Day) {
                            System.out.println("수정하고싶은 목록을 선택해주세요");
                            System.out.println("1.날짜 || 2.구입물품 || 3.수입 || 4.지출금액 || 5.결제수단");
                            int number = scan.nextInt();
                            if (number == 1) {
                                System.out.println("날짜를 변경해주세요 (ex> 2021 08 01)");
                                homeMoney.get(i).Day = scan.nextLine();
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
                            } else if (number == 5) {
                                System.out.println("결제수단 변경");
                                homeMoney.get(i).pay = scan.next();
                            } else {
                                System.out.println("번호를 잘못 입력했습니다");
                            }
                        }
                    }

                } else if (num == 4) {
                    int addSum =0;
                    int minusSum = 0;
                    System.out.println("출력하고싶은 월을 선택해 주세요>>");
                    int month = scan.nextInt();
                    System.out.print("NO      날짜        지출목록        수입목록       지출금액       결제수단");
                    System.out.println();

                    for(int i = 0; i < homeMoney.size(); i++) {
                        Day tmp;
                        Day temp;
                        for(int j = 0; j < homeMoney.size(); j++) {
                            if(homeMoney.get(i).addMoney > homeMoney.get(j).addMoney) {
                                tmp = homeMoney.get(j); //10000
                                homeMoney.remove(j);
                                temp = homeMoney.get(i); //20000
                                homeMoney.remove(i);
                                homeMoney.add(i, tmp);
                                homeMoney.add(j, temp);
                            }
                        }
                    }

                    for (int i = 0; i < homeMoney.size(); i++) {
                        if(homeMoney.get(i).Day.charAt(5)-'0' == month / 10) {
                            if (homeMoney.get(i).Day.charAt(6) - '0' == month % 10) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                            else if(homeMoney.get(i).Day.charAt(6) - '0' == month % 10) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                            else if(homeMoney.get(i).Day.charAt(6) - '0' == month % 10) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                        }
                        else if(homeMoney.get(i).Day.charAt(6) == month) {
                            System.out.print("("+ (i+1+")  ") + homeMoney.get(i).Day + "     "
                                    + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                    "        " + homeMoney.get(i).minusMoney +"         "+ homeMoney.get(i).pay + "\n");
                            addSum += homeMoney.get(i).addMoney;
                            minusSum += homeMoney.get(i).minusMoney;
                        }
                        else {
                            System.out.println("번호를 잘못 입력 하셨습니다.");
                        }


                    }
                    System.out.println("======================================================================");


                    System.out.println("                                 총수입       총지출       남은금액");
                    System.out.println("                                  " + addSum + "      " + minusSum + "        " + (addSum - minusSum));


                    addSum = 0;
                    minusSum = 0;

                } else if (num == 5) {
                    int addSum =0;
                    int minusSum = 0;
                    System.out.println("검색 기능을 실행합니다.");
                    System.out.println("1.구입물품 || 2.구입날짜 || 3.수입금액 || 4.지출금액 || 5.소비유형");
                    int choice = scan.nextInt();
                    if (choice == 1) {
                        System.out.print("찾고싶은 구입물품을 입력해주세요>>");
                        String st = scan.next();
                        System.out.print("NO      날짜        지출목록        수입목록       지출금액       결제수단");
                        System.out.println();
                        for(int i = 0; i < homeMoney.size(); i++) {
                            if(homeMoney.get(i).s.equals(st)) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                        }
                        System.out.println("===============================================================================");
                        System.out.println("                                 총수입       총지출       남은금액");
                        System.out.println("                                  " + addSum + "      " + minusSum + "        " + (addSum - minusSum));

                    } else if (choice == 2) {
                        scan.nextLine();
                        System.out.print("찾고싶은 물품구입 날짜를 입력해주세요>> (ex 2021 08 11)");
                        String st = scan.nextLine();
                        System.out.print("NO      날짜        지출목록        수입목록       지출금액       결제수단");
                        System.out.println();
                        for(int i = 0; i < homeMoney.size(); i++) {
                            if(homeMoney.get(i).Day.equals(st)) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                        }
                        System.out.println("===============================================================================");
                        System.out.println("                                 총수입       총지출       남은금액");
                        System.out.println("                                  " + addSum + "      " + minusSum + "        " + (addSum - minusSum));

                    }
                    else if (choice == 3) {
                        System.out.print("찾고싶은 수입을 입력해주세요>>");
                        int money = scan.nextInt();
                        System.out.print("NO      날짜        지출목록        수입목록       지출금액       결제수단");
                        System.out.println();
                        for(int i = 0; i < homeMoney.size(); i++) {
                            if(homeMoney.get(i).addMoney == money) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                        }
                        System.out.println("===============================================================================");
                        System.out.println("                                 총수입       총지출       남은금액");
                        System.out.println("                                  " + addSum + "      " + minusSum + "        " + (addSum - minusSum));
                    }else if (choice == 4) {
                        System.out.print("NO      날짜        지출목록        수입목록       지출금액       결제수단");
                        System.out.println();
                        System.out.print("찾고싶은 수입을 입력해주세요>>");
                        int money = scan.nextInt();
                        for(int i = 0; i < homeMoney.size(); i++) {
                            if(homeMoney.get(i).minusMoney == money) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                        }
                        System.out.println("===============================================================================");
                        System.out.println("                                 총수입       총지출       남은금액");
                        System.out.println("                                  " + addSum + "      " + minusSum + "        " + (addSum - minusSum));
                    }
                    else if (choice == 5) {
                        System.out.print("NO      날짜        지출목록        수입목록       지출금액       결제수단");
                        System.out.println();
                        System.out.print("찾고싶은 수입을 입력해주세요>>");
                        String st = scan.next();
                        for(int i = 0; i < homeMoney.size(); i++) {
                            if(homeMoney.get(i).pay.equals(st)) {
                                System.out.print("(" + (i + 1 + ")  ") + homeMoney.get(i).Day + "     "
                                        + homeMoney.get(i).s + "            " + homeMoney.get(i).addMoney +
                                        "        " + homeMoney.get(i).minusMoney + "         " + homeMoney.get(i).pay + "\n");
                                addSum += homeMoney.get(i).addMoney;
                                minusSum += homeMoney.get(i).minusMoney;
                            }
                        }
                        System.out.println("===============================================================================");
                        System.out.println("                                 총수입       총지출       남은금액");
                        System.out.println("                                  " + addSum + "      " + minusSum + "        " + (addSum - minusSum));
                    }
                } else if(num == 6) {
                    System.out.println("가계부 프로그램을 종료합니다.");
                }
                else {
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
