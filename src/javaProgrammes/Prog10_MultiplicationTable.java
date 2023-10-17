package javaProgrammes;

/*10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8 Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

import java.util.Scanner;

public class Prog10_MultiplicationTable {
        //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scanner.nextInt();
        System.out.println(n+" X 1 = " + n * 1);
        System.out.println(n+" X 2 = " + n * 2);
        System.out.println(n+" X 3 = " + n * 3);
        System.out.println(n+" X 4 = " + n * 4);
        System.out.println(n+" X 5 = " + n * 5);
        System.out.println(n+" X 6 = " + n * 6);
        System.out.println(n+" X 7 = " + n * 7);
        System.out.println(n+" X 8 = " + n * 8);
        System.out.println(n+" X 9 = " + n * 9);
        System.out.println(n+" X 10 = " + n * 10);
        scanner.close();
    }}