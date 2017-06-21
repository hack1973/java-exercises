package org.launchcode.java.prepwork;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;

/**
 * Created by Hackman on 5/10/2017.
 */
public class String_AliceInWonderland {
    public static void main(String[] args) {
        Scanner in;
        String alice;
        String search_term;
        Boolean search_results;

        in = new Scanner(System.in);
        alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        alice = alice.toLowerCase();
        System.out.println("Enter a term to search for: ");
        search_term = in.nextLine();
        search_term = search_term.toLowerCase();
        search_results = alice.contains(search_term);
        System.out.println("Was the search term " + search_term + " found?: " + search_results);
    }
}
