package javaProgrammes;

/*17. Write a Java program to convert a decimal number to binary number.
        Input Data:
        Input a Decimal Number : 5
        Expected Output
        Binary number is: 101*/

import java.util.Scanner;

public class Prog17_DecimaltoBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int x = scanner.nextInt();
        String y = Integer.toBinaryString(x);
        System.out.println(y);
    }}

