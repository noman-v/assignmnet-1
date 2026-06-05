package day2;
import  java.util.Scanner;
public class d2p13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inc;
        System.out.print("Enter your CTC : ");
        inc = input.nextInt();
        if (inc <= 250000) System.out.println("Tax to be paid is 0");
        else if (inc > 250000 && inc <= 500000)System.out.println("Tax to be paid is " + 0.05 * inc);
        else if (inc > 500000&& inc<=1000000) System.out.println("Tax to be paid is " + 0.2 * inc);
else if(inc >1000000) System.out.println("Tax to be paid is " + 0.3 * inc);
    }
}
