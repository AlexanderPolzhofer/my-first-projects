package at.campus.oop.bankAccount;

public class SavingAccount extends BaseAccount {
    private double interest;

    public SavingAccount(double accountBalance, double interest) {
        super(accountBalance);
        this.interest = interest;
    }

    @Override
    public double withdrawMoney(double withdraw) {
        if ((getAccountBalanceWithInterest() - withdraw) > 0) {
            return super.withdrawMoney(withdraw);
        } else {
            System.out.println("insufficient account coverage");
        }
        return 0;
    }

    @Override
    public double depositMoney(double deposit) {
        return super.depositMoney(deposit);
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    public double getInterestValue() {
        return this.interest * super.getAccountBalance();
    }

    public double getAccountBalanceWithInterest() {
        return getAccountBalance() + getInterestValue();
    }
}
