package org.launchcode.java.prepwork;

/**
 * Created by Hackman on 5/10/2017.
 */
public class ArrayList {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenArraySum(numbers);
    }

    public static void evenArraySum(int numbers[]) {

        int sum = 0;

        for (int n: numbers) {

            if (n % 2 == 0) {
                sum = sum + n;
            }
        }
        System.out.println("The sum of all even numbers is: " + sum);
    }
}
