package day3;

import java.util.Scanner;

public class d3p2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int N=input.nextInt();
    int[] arr= new int[N];
    for(int i=0;i<N;i++){
        System.out.print("Enter the "+(i+1)+"th element: ");
        arr[i]=input.nextInt();
    }
    int sum=0;
    float avg=0;
    for(int i=0;i<N;i++){
        sum+=arr[i];
    }
    avg=(float)sum/N;
    System.out.println("the average is "+avg);
    System.out.println("the sum is "+sum);

}
}
