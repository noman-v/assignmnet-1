package day1;

import java.util.Scanner;
public class d1p9 {
    public static void main(String[] args){
        int a,b,c,d,e;
        System.out.print("Enter the marks of English :");
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        System.out.print("Enter the marks of Maths :");
        b=input.nextInt();
        System.out.print("Enter the marks of Science :");
        c=input.nextInt();
        System.out.print("Enter the marks of Social Science :");
        d=input.nextInt();
        System.out.print("Enter the marks of Computer Hindi :");
        e=input.nextInt();
        float k=(((a+b+c+d+e)*100)/500.0f);
        System.out.println("\n\n--your overall percentage is : "+k);
        if(k>=40.0f){
            System.out.print(" , so you pass");
        }
        else{
            System.out.print(" , sorry better luck next time");
        }
    }
}
