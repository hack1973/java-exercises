package org.launchcode.java.prepwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Hackman on 5/10/2017.
 */

public class studentIDHashMap {

    public static void main(String[] args) {

        java.util.HashMap<Integer, String> studentID = new java.util.HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter your students ID numbers (or 0 to finish):");

        // Get student ID numbers and names
        do {

            System.out.print("Student ID: ");
            newStudentID = in.nextInt();

            if (!newStudentID.equals(0)) {
                System.out.print("Student Name: ");
                String newName = in.next();
                studentID.put(newStudentID, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudentID.equals(0));

        // Print class roster
        System.out.println("\nClass roster:");
        System.out.println("\nStudent ID/Student name: ");

        for (Map.Entry<Integer, String> id : studentID.entrySet()) {

            System.out.println(id.getKey() + "/" + id.getValue());
        }
    }
}
