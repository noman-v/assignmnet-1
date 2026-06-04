package day2;
import java.lang.*;
import java.util.Scanner;
public class d2p5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        if (a % 5 == 0) {
            System.out.println("The number is divisible by 5 ");
        }else{
            System.out.println("The number is not divisible by 5");
        }
    }
}
