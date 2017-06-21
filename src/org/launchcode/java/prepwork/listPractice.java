package org.launchcode.java.demos.java4python.methods;

import java.util.ArrayList;

/**
 * Created by Doug Shook on 5/11/2017.
 */
public class listPractice {

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
        //if index exists in smaller list
        //add values, store in result
        //else
        //put value from larger list in result

        return result;
    }
}