package day2;

import java.util.Scanner;

public class d2p3 {
        public static void main(String[] args){
            int a,b,c,d,e;
            System.out.print("Enter the marks of English :");
            Scanner input = new Scanner(System.in);
            a=input.nextInt();
            System.out.print("Enter the marks of Maths :");
            b=input.nextInt();
            System.out.print("Enter the marks of Science :");
            c=input.nextInt();
            System.out.print("Enter the marks of Social Science :");
            d=input.nextInt();
            System.out.print("Enter the marks of Computer Hindi :");
            e=input.nextInt();
            float k=(((a+b+c+d+e)*100)/500.0f);
            System.out.println("\n\n--your overall percentage is : "+k);
            char grade;

            if(k >= 90) {
                grade = 'A';}
            else if (k >= 80) {grade = 'B';
            }
            else if (k >= 70) {
                grade = 'C';}
            else if (k >= 60) {
                grade = 'D';}
            else {grade = 'F';
            }

            System.out.println("The grade for " + k + "% is: " + grade);

        }
        }



