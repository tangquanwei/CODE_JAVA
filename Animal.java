class Account {

    protected double balance;

    Account() {

        balance = 0;

    }

    Account(double balance) {

        this.balance = balance;

    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    boolean withDraw(double money) {
        if (money > balance)

            return false;

        else {
            balance -= money;

            return true;

        }
    }

    void deposit(double money) {
        balance += money;
    }
}

class CheckingAccount extends Account {

    private double overdraft;

    public CheckingAccount() {

        balance = 0;

        overdraft = 0;

    }

    public CheckingAccount(double balance, double overdraft) {

        this.balance = balance;

        this.overdraft = overdraft;

    }

    boolean withDraw(double money) {
        if (money > overdraft)
            return false;
        else {

            balance -= money;

            return true;
        }
    }
}