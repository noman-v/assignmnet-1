package day2;

import java.util.Scanner;

public class d2p9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the balance ");
        double balance = scanner.nextDouble();
        System.out.print("Enter money to be withdrawn:");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        if (balance - amount < 1000) {
            System.out.println("Transaction denied: Minimum balance of ₹1000 must remain");
            return;
        }

        double newBalance = balance - amount;
        System.out.println("Withdrawal successful. New balance: ₹" + newBalance);

    }
}
