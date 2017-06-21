package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by Hackman on 5/10/2017.
 */
public class Area {
    public static void main(String[] args) {
        Scanner in;
        Double radius;
        Double area;

        in = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        radius = in.nextDouble();
        area = 3.14 * (radius * radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);


    }
}
