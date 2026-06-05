package day2;

import java.util.Scanner;

public class d2p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {System.out.println("Positive");
        } else {System.out.println("Not Positive");}

        if (number % 2 == 0) {
            System.out.println("Even");}
        else {System.out.println("Odd");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
    }
}
