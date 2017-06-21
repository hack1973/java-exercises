package org.launchcode.java.prepwork;

import java.util.Scanner;

/**
 * Created by Hackman on 5/10/2017.
 */
public class NumericType_MPG {
    public static void main(String[] args) {
        Scanner in;
        Float miles;
        Float gallons;

        in = new Scanner(System.in);
        System.out.println("Enter the miles you have driven:");
        miles = in.nextFloat();

        System.out.println("Enter the gallons of gas you have used:");
        gallons = in.nextFloat();

        Float mpg = miles / gallons;

        System.out.println("You are getting : " + mpg + " MPG!");
    }
}
