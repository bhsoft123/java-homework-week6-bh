package javaProgrammes;

import java.util.Scanner;

/*9. Write a program to convert the upper case to lower case*/
public class Prog9_Uppercase {

     //main method to convert the letter to lower case
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter any letter in upper case:");
         String letter = scanner.next();
         System.out.println(letter.toLowerCase());
         scanner.close();
         }
     }
