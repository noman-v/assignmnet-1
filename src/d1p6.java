import java.util.Scanner;
public class d1p6 {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = input.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = input.nextDouble();

        double sum = a + b;
        double diff = a - b;
        double product = a * b;
        double quo = a / b;
        double rem = a % b;


        System.out.println("Addition (a + b)    = " + sum);
        System.out.println("Subtraction (a - b)  = " + diff);
        System.out.println("Multiplication (a * b) = " + product);
        System.out.println("Division (a / b)   = " + quo);
        System.out.println("Modulus (a % b)  = " + rem );

        input.close();
    }
}