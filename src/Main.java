import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Account account = new Account();
            System.out.println("Enter account number:");
            account.setAcc_no(sc.nextLong());
            System.out.println("Enter name:");
            account.setName(sc.next());
            System.out.println("Enter amount:");
            account.setAmount(sc.nextFloat());
            System.out.println("Account_no:" + account.getAcc_no());
            System.out.println("Name:" + account.getName());
            System.out.println("Amount:" + account.getAmount());
        }

    }
}