package day2;
import java.util.Scanner;

public class d2p12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your cgpa: ");
        float cg = input.nextFloat();
        System.out.print("Enter active backlogs count: ") ;
        int backlogs = input.nextInt();
        System.out.print("Enter attendance percentage: ");
        float attendance = input.nextFloat();

        if(cg >= 7.0 && backlogs == 0 && attendance >= 75) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");}
    }
}
