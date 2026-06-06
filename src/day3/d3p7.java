package day3;

import java.util.Arrays;

public class d3p7 {
    public static void main(String[] args) {
        int[] og = {1, 2, 3, 4, 5};
        int[] copy= new int[og.length];

        for (int i = 0; i < og.length; i++) {
            copy[i] = og[i];
        }

        System.out.print("Original Array: " );
        for(int i=0;i<og.length;i++){
            System.out.print(og[i]+" ");
        }
        System.out.print("\nCopied Array: ");
        for(int i=0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }
    }
}
