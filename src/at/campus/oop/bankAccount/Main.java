package at.campus.oop.bankAccount;

public class Main {
    public static void main(String[] args) {

        BaseAccount ba = new BaseAccount(10000);
        CheckingAccount ca = new CheckingAccount(2000, 100);
        SavingAccount sa = new SavingAccount(100000, .0125);
        LaendleAccount la = new LaendleAccount(55123, 10000, .0125, 100000);

        System.out.println(ba.getAccountBalance());
        System.out.println(ba.depositMoney(555));
        System.out.println(ba.getAccountBalance());

        ba.depositMoney(2554.1456);
        System.out.println(ba.getAccountBalance());


        System.out.println(ba.withdrawMoney(3664.1456));
        System.out.println(ba.getAccountBalance());

        System.out.println(ca.getLimit());
        ca.depositMoney(50000);
        System.out.println(ca.getAccountBalance());
        ca.withdrawMoney(89);
        ca.withdrawMoney(123456);

        System.out.println(sa.getAccountBalance());

        sa.depositMoney(11235);
        System.out.println(sa.getAccountBalance());
        sa.withdrawMoney(100);
        System.out.println(sa.getAccountBalance() + " €");
        System.out.println(sa.getAccountBalanceWithInterest() + " €");
        System.out.println(sa.getInterestValue() + " €");

        System.out.println(la.getInterest());
        System.out.println(la.getAccountBalance());
        System.out.println(la.getInterestValue() + " €");
        System.out.println(la.getInsuranceProtection() + " €");
        System.out.println("Has masterCard? " + la.hasMasterCard());

    }
}
