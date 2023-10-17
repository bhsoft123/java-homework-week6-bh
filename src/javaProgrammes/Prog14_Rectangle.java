package javaProgrammes;
/*14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.text.DecimalFormat;

public class Prog14_Rectangle {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double area = width*height;
        double perimeter = 2* (width+height);

        DecimalFormat df = new DecimalFormat("0.00");
        String formattedArea = df.format(area);
        String formattedperimeter = df.format(perimeter);
        System.out.println("Area is " + width +" * " + height + "= " + formattedArea);
        System.out.println("Perimeter is 2 * (" + width +" + " + height +" ) = "+ formattedperimeter);
    }
}
