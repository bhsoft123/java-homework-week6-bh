package javaProgrammes;

/*19. Write a Java program to convert a given string into lowercase.
        Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        Output: the quick brown fox jumps over the lazy dog*/

import java.util.Scanner;

public class Prog19_StringUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence in uppercase letters:");
        String name = scanner.nextLine();
        System.out.println(name.toLowerCase());
        scanner.close();
    }
}
