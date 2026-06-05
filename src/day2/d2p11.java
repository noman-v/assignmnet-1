package day2;
import java.util.Scanner;

public class d2p11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the first number :");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number :");
        double num2=input.nextDouble() ;
        char op = input.next().charAt(0);
        if(op == '+') {
            System.out.println(num1 + num2);
        } else if(op=='-') {
            System.out.println(num1-num2);
        }  else if (op == '*') {
            System.out.println(num1 * num2);}
        else if (op == '/'){
            if (num2 != 0) {System.out.println(num1 / num2);}
            else {
                System.out.println("Cannot divide by zero");
            }
        } else if(op == '%') {
            if(num2 !=0) {System.out.println(num1 % num2);
            }else{
                System.out.println("Cannot divide by zero");}
        } else{System.out.println("Invalid operator");}
    }
}
