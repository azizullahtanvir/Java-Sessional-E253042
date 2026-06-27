class Lab5Task1BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Islami Bank Bank";

    Lab5Task1BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class Lab5Task1Main {

    public static void main(String[] args) {

        Lab5Task1BankAccount.showBankName();

        Lab5Task1BankAccount acc1 = new Lab5Task1BankAccount(101231, "Tanvir", 100000);
        Lab5Task1BankAccount acc2 = new Lab5Task1BankAccount(102232, "Hafez", 80000);

        acc1.displayAccount();
        acc2.displayAccount();
    }
}