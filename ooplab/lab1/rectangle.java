
package ooplab.lab1;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        int length, breadth, circum, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle");
        length = sc.nextInt();

        System.out.println("Enter breadth of rectangle");
        breadth = sc.nextInt();

        circum = 2 * (length + breadth);
        area = length * breadth;

        System.out.println("Area of rectangle " + area);
        System.out.println("Circumference of rectangle " + circum);

    }
}