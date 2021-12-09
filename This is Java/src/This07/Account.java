package This07;

public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void diposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if(this.balance < money){
            throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + "모자람");
        }

        this.balance -= money;
    }
}
