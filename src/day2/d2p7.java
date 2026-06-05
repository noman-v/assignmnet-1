package day2;
import java.util.Scanner;
public class d2p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double s1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double s2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double s3 = scanner.nextDouble();
        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
            if (s1 == s2 && s2 == s3) {
                System.out.println(" it an Equilateral triangle");
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                System.out.println("its an Isosceles triangle");
            } else {
                System.out.println("it a Scalene triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
