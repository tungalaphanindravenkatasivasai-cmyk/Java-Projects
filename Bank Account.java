import java.util.Scanner;

class Main {
    String AccountName;
    long AccountNumber;
    double Balance;
    String AccountType;

    Main(String name, long number, double balance, String type) {
        AccountName = name;
        AccountNumber = number;
        Balance = balance;
        AccountType = type;
    }

    void DisplayAccountInfo() {
        System.out.println("Account Name: " + AccountName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + Balance);
        System.out.println("Account Type: " + AccountType);
    }

    void Deposit(double amount) {
        Balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + Balance);
    }

    void Withdraw(double amount) {
        if (amount <= Balance) {
            Balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New Balance: " + Balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long number = sc.nextLong();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();

        Main account = new Main(name, number, balance, type);

        account.DisplayAccountInfo();

        System.out.print("Enter Deposit Amount: ");
        account.Deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        account.Withdraw(sc.nextDouble());
    }
}