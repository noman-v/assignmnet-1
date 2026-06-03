package day1;

import java.util.Scanner;

public class d1p4_swap {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter the first number(a)");
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        System.out.print("Enter the second number(b)");
        b=input.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
