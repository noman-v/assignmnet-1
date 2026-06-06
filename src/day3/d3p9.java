package day3;

import java.util.Scanner;

public class d3p9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N=input.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i]=input.nextInt();
        }
        int pos = 0, neg = 0, zero = 0;

        for (int x : arr) {
            if (x > 0) {pos++;
            }
            else if (x < 0) {
                neg++;}

            else {zero++;}
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
