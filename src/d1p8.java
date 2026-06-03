import java.util.Scanner;
public class d1p8 {
    public static void main(String [] args){
        System.out.print("Enter the number to check : ");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        if(a%2==0){
            System.out.println("The number "+a+" is even ");
        }
        else{
            System.out.println("The number "+a+" is odd ");
        }
    }
}
