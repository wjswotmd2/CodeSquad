package This02;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accounts = new Account[100];
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while(run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");

            int selectNo = scan.nextInt();

            if(selectNo == 1){
                createAccount();
            }
            else if(selectNo == 2) {
                accountList();
            }else if(selectNo == 3) {
                deposit();
            }else if(selectNo == 4) {
                withdraw();
            }else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("-------------");
        System.out.println("계좌생성");
        System.out.println("-------------");
        System.out.print("계좌번호 : ");
        String ano = scan.next();
        System.out.print("계좌주 : ");
        String owner = scan.next();
        System.out.print("초기입금액 : ");
        int balance = scan.nextInt();
        for(int i = 0 ; i < accounts.length; i++) {
            if (accounts[i] == null) {
                Account account = new Account(ano, owner, balance);
                accounts[i] = account;
                break;
            }
        }
        System.out.println("결과 계좌가 생성되었습니다.");
    }

    private static void withdraw() {
        System.out.println("------------");
        System.out.println("출금");
        System.out.println("------------");
        System.out.print("계좌번호 :");
        String ano = scan.next();
        System.out.print("출금액 : ");
        int balance = scan.nextInt();
        Account account = findAccount(ano);
        if(account.getBalance() > balance) {
            account.setBalance(account.getBalance() + balance);
        }
        else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + account.getBalance());
        }
    }

    private static void deposit() {
        System.out.println("------------");
        System.out.println("예금");
        System.out.println("------------");
        System.out.print("계좌번호 :");
        String ano = scan.next();
        System.out.print("입금액 : ");
        int balance = scan.nextInt();
        Account account = findAccount(ano);
        account.setBalance(account.getBalance() + balance);
    }

    private static void accountList() {
        System.out.println("-----------");
        System.out.println("계좌목록");
        System.out.println("-----------");
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null) {
                System.out.println(accounts[i].getAno() + " \t" + accounts[i].getOwner() + " \t" + accounts[i].getBalance());
            }
        }
    }

    private static Account findAccount(String ano) {
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i].getAno().equals(ano)) {
                return accounts[i];
            }
        }
        return null;
    }
}
