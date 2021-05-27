package at.campus.oop.bankAccount;

public class LaendleAccount extends CheckingAccount {
    private double interest;
    private int insuranceProtection;

    public LaendleAccount(double accountBalance, int limit, double interest, int insuranceProtection) {
        super(accountBalance, limit);
        this.interest = interest;
        this.insuranceProtection = insuranceProtection;
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    @Override
    public int getLimit() {
        return super.getLimit();
    }

    public double getInterest() {
        return interest;
    }

    public double getInterestValue() {
        return super.getAccountBalance() * getInterest();
    }

    public int getInsuranceProtection() {
        return insuranceProtection;
    }

    public boolean hasMasterCard() {
        return true;
    }
}
