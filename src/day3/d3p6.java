package day3;

import java.util.Scanner;

public class d3p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N=input.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i]=input.nextInt();
        }
        System.out.print("Reverse of the array is :");
        for(int i=0;i<N;i++){
            System.out.print(arr[N-i-1]+" ");
        }
    }
}
