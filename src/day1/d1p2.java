package day1;

import java.util.Scanner;
public class d1p2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        System.out.println("square = " + a*a);
        System.out.println("cube = "+a*a*a);

    }
}