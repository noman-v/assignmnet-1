package day2;
import java.util.Scanner;
public class d2p4 {
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the number to be checked :");
    int n=input.nextInt();
    if(n<0) {System.out.println("Negative number");}

    else if(n==0){
        System.out.println("Zero");
    }
    else{

        System.out.println("Positive");
    }
    }



}

