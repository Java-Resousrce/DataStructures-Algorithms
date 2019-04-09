package com.tahvildari.java.searchingalgorithms.Interval;

public class JumpSearch {

    // The jumSearch algorithm aim to check fewer elements than LinearSearch
    // the time complexity of this algorithm is O(sqrt(size of array))
    // the best block size is sqrt(size of array)
    static int jumpSearch(int[] array, int length, int value) {

        int blockSize = (int) Math.floor(Math.sqrt(length));
        int step = blockSize;

        int previous = 0;

        //find the block which may contain element with intended value
        while (array[Math.min(step, length) - 1] < value) {
            previous = step;
            step += blockSize;

            if (previous >= length)
                return -1;
        }

        //Linear search in above block
        while (array[previous] < value) {
            previous++;

            // If we reached next block or end of
            // array, element is not present
            if (array[previous] == Math.min(step, length))
                return -1;
        }

        if (array[previous] == value)
            return previous;


        return -1;
    }


    //Driver method to test
    public static void main(String args[]) {
        int[] array = {1, 5, 7, 12, 13, 25, 27};
        int value = 7;
        int index = jumpSearch(array, array.length, value);

        if (index == -1)
            System.out.println("The value is not existed in the given array");
        else
            System.out.println("the value is presented at the index =  " + index);


    }


}
