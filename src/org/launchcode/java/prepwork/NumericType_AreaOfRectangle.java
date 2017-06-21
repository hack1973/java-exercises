package org.launchcode.java.prepwork;

import java.util.Scanner;

/**
 * Created by Hackman on 5/10/2017.
 */
public class NumericType_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in;
        Float length;
        Float width;

        in = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle: ");
        length = in.nextFloat();

        System.out.println("Enter the width of your rectangle: ");
        width = in.nextFloat();

        Float area = length * width;

        System.out.println("Hello, the area of your rectangle is: " + area + "!");
    }
}
