package javaProgrammes;

/*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prog6_Circle {

        //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of Circle :");
        double r = scanner.nextDouble();
        double area = 3.14*r*r;

        //decimal formatting upto 2 decimal points
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedArea = df.format(area);
        System.out.println("Area of Circle is " + formattedArea);
        scanner.close();
        }
    }
