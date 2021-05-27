package at.campus.oop.bankAccount;

public class BaseAccount {
    private double accountBalance;

    public BaseAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public double depositMoney(double deposit) {
        return this.accountBalance += deposit;
    }

    public double withdrawMoney(double withdraw) {
        return this.accountBalance -= withdraw;
    }

}
