package day2;

import java.util.Scanner;

public class d2p6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("TO check the validity of the trisngle please enter the angle a,b,c");
        System.out.println("Enter a :");
        double a=input.nextDouble();
        System.out.println("Enter b :");
        double b=input.nextDouble();
        System.out.println("Enter c :");
        double c=input.nextDouble();
    if(a+b+c==180){
        System.out.println("the triangle is a valid triangle");
    }
    else{
        System.out.println("the triangle is not a valid triangle");
    }
    }
}
