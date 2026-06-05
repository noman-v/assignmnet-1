package day2;
import java.util.Scanner;
public class d2p8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units that you used : ");
        float u = input.nextFloat();
        float bill=0;
        if(u<=100)bill=u*5;
        if(u>100&&u<200){
            bill=100*5+(u-100)*7;
        }
        else if(u>200){
            bill=100*5+(100*7)+(u-200)*10;
        }
        System.out.println("the bill is "+bill);
    }
}
