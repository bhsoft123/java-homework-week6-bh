package javaProgrammes;
/*15. Write a Java program to swap two variables.*/

public class Prog15_Swap {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int temp;
        System.out.println("Before swapping");
        System.out.print("a = " + a);
        System.out.println(" and b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping");
        System.out.print("a = " + a);
        System.out.println(" and b = " + b);
    }
}
