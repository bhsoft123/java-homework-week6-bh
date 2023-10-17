package javaProgrammes;

/*13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers*/

import java.util.Scanner;

public class Prog13_Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println("Average of these three numbers : " + (x+y+z)/3);
}}
