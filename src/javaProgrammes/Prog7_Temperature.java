package javaProgrammes;

/*7. Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prog7_Temperature {

        //main method & scanning input data
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit: ");
            double temp = scanner.nextDouble();
            double celcius =  (temp - 32) * 5 / 9;

        //decimal formatting upto two decimal places
            DecimalFormat df = new DecimalFormat("0.00");
            String formatteddegree = df.format(celcius);
            System.out.println("Temperature in Celsius = " + formatteddegree + " °C");
            scanner.close();
            }
        }