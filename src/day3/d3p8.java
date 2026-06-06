package day3;

public class d3p8 {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int largest = numbers[0];
        int sl = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                sl = largest;
                largest = num;
            } else if (num > sl && num != largest) {
                sl = num;
            }
        }
        System.out.println("the largest number is :" + largest);
            System.out.println("The second largest element is: " + sl);

    }
}
