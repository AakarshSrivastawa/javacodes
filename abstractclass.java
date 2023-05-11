
abstract class Bank {
    String bankName;
    abstract void getBalance();
}

class BankA extends Bank {
    static int balance = 100;
    BankA() {
        bankName = "Bank A";
    }
    void getBalance() {
        System.out.println(bankName + " balance: $" + balance);
    }
}

class BankB extends Bank {
    static int balance = 150;
    BankB() {
        bankName = "Bank B";
    }
    void getBalance() {
        System.out.println(bankName + " balance: $" + balance);
    }
}

class BankC extends Bank {
    static int balance = 200;
    BankC() {
        bankName = "Bank C";
    }
    void getBalance() {
        System.out.println(bankName + " balance: $" + balance);
    }
}

public class labbank {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        
        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}