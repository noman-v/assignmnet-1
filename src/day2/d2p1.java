import java.util.Scanner;

public class d2p1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        a = input.nextInt();
        System.out.print("Enter the second number (b): ");
        b = input.nextInt();
        System.out.print("Enter the third number (c): ");
        c = input.nextInt();
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("biggest number out of these three is "+max);   }
}