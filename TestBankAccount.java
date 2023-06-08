class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
        BankAccount ba3 = new BankAccount();

        ba1.depositChecking(3000.00);
        ba1.depositSavings(10000.00);

        System.out.println(ba1.getCheckingBalance());
        System.out.println(ba1.getSavingsBalance());

        ba1.withdrawChecking(1000.00);
        System.out.println(ba1.getCheckingBalance());
        ba1.withdrawChecking(2500.00); //error

        ba1.getTotalFunds();
    }
}