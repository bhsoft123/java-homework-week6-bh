package javaProgrammes;
/*16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101*/

import java.util.Scanner;

public class Prog16_Binary {
        //main method & input data
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number:");
        String first = scanner.nextLine();
        System.out.println("Input second binary number:");
        String second = scanner.nextLine();

        //converting binary numbers into integer
        int num1 = Integer.parseInt(first, 2);
        int num2 = Integer.parseInt(second, 2);
        int sum = num1 + num2;

        //converting integer addition into binary
        String t = Integer.toBinaryString(sum);
        System.out.println(t);
        scanner.close();
    }}