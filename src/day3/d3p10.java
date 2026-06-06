package day3;

import java.util.Scanner;

public class d3p10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N=input.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i]=input.nextInt();
        }
        int ok = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ok = 1;
                break;
            }
        }

        if (ok==0) {
            System.out.println("\t Array is Sorted");
        } else if (ok==1) {
            System.out.println("\t Array is Not Sorted");
        }
    }
}
