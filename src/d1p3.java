import java.util.Scanner;
public class d1p3 {
    public static void main(String[] args) {
        System.out.print("welcome here \n please enter your name :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("please enter your age :");
        int age = input.nextInt();
        System.out.print("please enter your percentage :");
        float per = input.nextFloat();
        System.out.println("\n\n\nYour name is : " + name + "\nyour age is :" + age + "\n your percenage is :" + per);
    }
    }
