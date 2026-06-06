package day3;

import java.util.Scanner;

public class d3p4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int even=0,odd=0;
        System.out.print("Enter the number of elements: ");
        int N=input.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i]=input.nextInt();
            if(arr[i]%2==0)even++;
            else{odd++;}
        }
        System.out.println("the number of even is "+even);
        System.out.println("the number of odd is "+odd);
    }
}
