package org.launchcode.java.prepwork;

/**
 * Created by Hackman on 5/10/2017.
 */
public class ArrayListAndStrings {

    public static void main(String[] args) {

        String words[] = {"john", "Angie", "Bella", "Sophia", "Mike", "Cathy"};

        fiveLetterWords(words);
    }

        public static void fiveLetterWords(String words[]) {


            System.out.println("These words in the list have 5 letters: ");

            for (String w : words) {

                if (w.length() == 5) {
                    System.out.println(w);
                }
            }
        }
}
