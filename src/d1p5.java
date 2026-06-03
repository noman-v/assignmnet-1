import java.util.Scanner;

public class d1p5 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number (a) :");
        a=input.nextInt();
        System.out.print("Enter the second number (b) :");
        b=input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("now \na = "+ a + "\nb = "+b);
    }
}
