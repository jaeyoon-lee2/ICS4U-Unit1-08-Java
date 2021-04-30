/*
* This program generate array of 10 random numbers between 1 to 99,
* find and shows maximum and minimum values of the array.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-04-30
*/
// package ca.mths.unit1.unit08.java.main;

import java.util.Random;

public final class MaxAndMinNumbers {
    // Constant
    /** Size of array. */
    static final int ARRAY_SIZE = 10;
    /** Maximum range of random number. */
    static final int MAX_RANGE = 99;

    /**
    * This method find out the maximum value in array and return maximum value.
    * @param array - array of random numbers
    * @return maxValue
    */
    public static int max(final int[] array) {
        // Set initial maximum value
        int maxValue = array[0];

        // Find maximum value
        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        // Return maximum value
        return maxValue;
    }

    /**
    * This method find out the minimum value in array and return minimum value.
    * @param array - array of random numbers
    * @return maxValue
    */
    public static int min(final int[] array) {
        // Set initial minimum value
        int minValue = array[0];

        // Find minimum value
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }

        // Return minimum value
        return minValue;
    }

    private MaxAndMinNumbers() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method generates array of 10 random numbers between 1 to 99,
    * passes array to functions called max and min,
    * gets and shows maximum and minimum values of the array.
    * @param args
    */
    public static void main(final String[] args) {
        Random random = new Random();

        int[] array = new int[ARRAY_SIZE];
        System.out.print("Array: ");

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(MAX_RANGE) + 1;
            array[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }
        // Process
        int maxValue = max(array);
        int minValue = min(array);

        // Output
        System.out.println("\nMaximum: " + maxValue + ", Minimum: " + minValue);
        System.out.println("\nDone.");
    }
}
