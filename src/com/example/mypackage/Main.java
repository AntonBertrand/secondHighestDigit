package com.example.mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Outputs the second highest digit in a String input

    public static void main(String[] args) {
        System.out.println(secondHighestDigit("doj6769ojojk"));
    }

    public static int secondHighestDigit(String input) {

        int numCount = 0;

        //Counts number of numerical digits
        for (int i = 0; i < input.length()-1; i++) {
            if (Character.isDigit(input.charAt(i))) {
                numCount += 1;
            }
        }

        if ((numCount == 0) || (numCount == 1)) {
            return -1;
        }

        // Ordering chars

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int num = Character.getNumericValue(input.charAt(i));
                array.add(num);
            }
        }

        Collections.sort(array);
        System.out.println(array);
        System.out.println("Second highest = " + array.get(numCount-2));

        return array.get(numCount-2);
    }
}
