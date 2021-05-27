package at.campus.oop.bankAccount;

public class CheckingAccount extends BaseAccount {
    private int limit;

    public CheckingAccount(double accountBalance, int limit) {
        super(accountBalance);
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public double depositMoney(double deposit) {
        return super.depositMoney(deposit);
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    @Override
    public double withdrawMoney(double withdraw) {
        if((getAccountBalance() - withdraw) > (limit * -1)){
            System.out.println("Withdraw: " + withdraw + " Euros");
        } else {
            System.out.println("insufficient account coverage");
        }
        return super.withdrawMoney(withdraw);
    }
}
