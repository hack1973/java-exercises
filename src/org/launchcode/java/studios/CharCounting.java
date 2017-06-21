package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hackman on 5/22/2017.
 */
public class CharCounting {

    public static void main(String[] args) {

        HashMap<Character, Integer> charCounts = new HashMap<>();
        String myString;

        myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = myString.toCharArray();

        // Read letters and characters

        for (char c: charactersInString) {
            if (charCounts.get(c) == null) {
                int newCount = 1;
                charCounts.put(c, newCount);
            }  else {
                int newCount = charCounts.get(c);
                charCounts.replace(c, newCount + 1);
            }
        }
        // Print letter count

        System.out.println("Letter : Count in String\n");

        for (Map.Entry<Character, Integer> charCount : charCounts.entrySet()) {
            System.out.println(charCount.getKey() + " : " + charCount.getValue());
        }
    }
}
