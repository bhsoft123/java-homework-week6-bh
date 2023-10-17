package javaProgrammes;

/*Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods*/

import java.util.Scanner;

public class Prog5_Calculator {
        //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        addition(a,b);
        subtraction(a,b);
        Prog5_Calculator obj1 = new Prog5_Calculator(); //calling instance methods via object
        obj1.multiplication(a,b);
        obj1.division(a,b);
        }

        //two static methods
    public static void addition(double a, double b){
        System.out.println("addition: " +(a+b));
    }
    public static void subtraction(double a , double b){
        System.out.println("subtraction: " +(a-b));
    }

        //two instance methods
    public void multiplication(double a, double b){
        System.out.println("multiplication: " +a*b);
    }
    public void division(double a, double b){
        System.out.println("division: " +(a/b));
    }
    }
