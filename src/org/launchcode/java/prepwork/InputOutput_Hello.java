package org.launchcode.java.prepwork;

import java.util.Scanner;

/**
 * Created by Hackman on 5/10/2017.
 */
public class InputOutput_Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("Hello, " + name + "!");
        }
    }

