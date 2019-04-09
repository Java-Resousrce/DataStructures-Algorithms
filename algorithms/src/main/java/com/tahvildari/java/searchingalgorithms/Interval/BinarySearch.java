package com.tahvildari.java.searchingalgorithms.Interval;

/**
 * The auxiliary space of this algorithm  in recursive implementation is log(n)
 *
 */
public class BinarySearch {

    // This method search value in given sorted array , if value is equal to middle element
    // return index of middle element; otherwise if value if greater of middle element it search for element in right
    // half of array , otherwise search for value in the left hand of array
    //paradigm:  Decrease and Conquer.
    static int binarySearch(int[] array, int leftIndex, int rightIndex, int value) {
        int middle = 0;

        if (rightIndex > 1) {
            middle = leftIndex + (rightIndex - 1) / 2;

            if (array[middle] == value)
                return middle;

            if (array[middle] < value) {

                return binarySearch(array, middle + 1, rightIndex, value);
            }

            return binarySearch(array, leftIndex, middle - 1, value);


        }

        return -1;

    }

    //Driver method to test
    public static void main(String args[]) {
        int[] array = {1, 5, 7, 12, 13, 25, 27};
        int value = 7;
        int index = binarySearch(array, 0, array.length, value);

        if (index == -1)
            System.out.println("The value is not existed in the given array");
        else
            System.out.println("the value is presented at the index =  " + index);


    }
}