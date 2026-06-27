interface Lab10Task2ATMService {

    void withdraw();
    void deposit();
    void checkBalance();
}
class Lab10Task2DBBL implements Lab10Task2ATMService {

    public void withdraw() {
        System.out.println("Withdraw money from DBBL");
    }

    public void deposit() {
        System.out.println("Deposit money to DBBL");
    }

    public void checkBalance() {
        System.out.println("Check balance in DBBL");
    }
}

public class Lab10Task2Main {

    public static void main(String[] args) {

        Lab10Task2ATMService dbblATM = new Lab10Task2DBBL();

        dbblATM.withdraw();
        dbblATM.deposit();
        dbblATM.checkBalance();
    }
}