package javaProgrammes;

/*8. Write a program to calculate the area of a triangle*/

import java.util.Scanner;

public class Prog8_Triangle {

        //main method, scanning test data & calculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Height of triangle:");
        double height = scanner.nextInt();
        System.out.println("Enter the Base of triangle:");
        double base = scanner.nextInt();
        System.out.println("Area of triangle is : " + height * base/ 2 );
        scanner.close();
        }
    }
