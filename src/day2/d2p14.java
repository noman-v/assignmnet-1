package day2;

import java.util.Scanner;

public class d2p14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        String rootNature;
        if (discriminant > 0) {
            rootNature = "Real and distinct";
        } else if (discriminant == 0) {
            rootNature = "Real and equal";
        } else {
            rootNature = "Imaginary";
        }
        System.out.println("The roots are: " + rootNature);

    }
}
