package day3;

import java.util.Scanner;

public class d3p5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N=input.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter the "+(i+1)+"th element: ");
            arr[i]=input.nextInt();
        }
        int key=0;
        System.out.print("Enter the number you want to find in array : ");
        key=input.nextInt();
        int count=0;
        for(int i=0;i<N;i++){
            if(arr[i]==key){
                System.out.println("key is found at "+(i+1)+"th position");
            count ++;
            }
        }
        if(count==0){
            System.out.println(" key not found ");
        }
    }
}
