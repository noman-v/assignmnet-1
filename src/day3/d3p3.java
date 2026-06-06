package day3;

import java.util.Scanner;

public class d3p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N=input.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<N;i++){
            if(arr[i]<min)min=arr[i];
            if(arr[i]>max)max=arr[i];
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}
