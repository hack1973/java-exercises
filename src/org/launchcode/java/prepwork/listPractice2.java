package org.launchcode.java.demos.java4python.methods;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Doug Shook on 5/11/2017.
 */
public class listPractice2 {

    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 1));
        ArrayList<Integer> two = new ArrayList<Integer>(Arrays.asList(1, 6));
        System.out.println(add(one, two));
    }

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        //find out which one is bigger
        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        if(a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }
        //create a new array list that holds the results
        ArrayList<Integer> result = new ArrayList<Integer>();

        //for each index in larger list
        for(int i = 0; i < bigger.size(); i++) {
            //if index exists in smaller list
            if(i < smaller.size()) {
                //add values, store in result
                result.add(bigger.get(i) + smaller.get(i));
            } else {
                //put value from larger list in result
                result.add(bigger.get(i));
            }
        }
        return result;
    }
}
