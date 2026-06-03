import java.util.Scanner;

public class d1p7 {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter the width of rectangle :");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.print("Enter the length of rectangle :");
        b= input.nextInt();
        int c=2*(a+b);
        int d=a*b;
        System.out.println("\n\n\njavaPerimeter of the recangle is "+c);
        System.out.println("Area of the rectangle is "+d);
    }
}
