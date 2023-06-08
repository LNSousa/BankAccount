import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    private static int numberOfAccounts;
    private static double cumulativeSum;

    public BankAccount () {
        Random rand = new Random();
        this.accountNumber = "";
        for(int i = 0; i < 10; i++) {
            this.accountNumber += rand.nextInt(10);
        }

        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        numberOfAccounts++;

        System.out.println(this.getAccountNumber());
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    private String getAccountNumber() {
        return this.accountNumber;
    }

    public void depositChecking(double amount) {
        this.checkingBalance += amount;
        cumulativeSum += amount;
    }

    public void depositSavings(double amount) {
        this.savingsBalance += amount;
        cumulativeSum += amount;
    }

    public void withdrawChecking(double amount) {
        if (this.getCheckingBalance() >= amount) {
            this.depositChecking(-amount);
            System.out.printf("Remaining balance: $%.2f\n", this.getCheckingBalance());
        } else {
            System.out.println("Insufficient amount.");
        }
    }

    public void withdrawSavings(double amount) {
        if (this.getSavingsBalance() >= amount) {
            this.depositSavings(-amount);
            System.out.printf("Remaining balance: $%.2f\n", this.getSavingsBalance());
        } else {
            System.out.println("Insufficient amount.");
        }
    }

    public void getTotalFunds() {
        System.out.printf("Total funds: $%.2f\n", this.getCheckingBalance() + this.getSavingsBalance());
    }

}