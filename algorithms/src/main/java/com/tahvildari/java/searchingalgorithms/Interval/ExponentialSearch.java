package com.tahvildari.java.searchingalgorithms.Interval;

import static com.tahvildari.java.searchingalgorithms.Interval.BinarySearch.binarySearch;

public class ExponentialSearch {

    //ExponentialSearch is specially useful when there are an unbounded array , its elements are infinite
    //Its time complexity is O(log (n))
    //better than BinarySearch when there are bounded array or the elements to be searched is closer to the first element
    static int exponentialSearch(int[] array , int length , int value)

    {
        //check the first element value
        if(array[0] == value)
            return  0 ;
         int i = 1;

         while(i< length && array[i] < value)
           i = i * 2;

          return  binarySearch(array , i/2 , Math.min(length, i), value);

    }


    //Driver method to test
    public static void main(String args[]) {
        int[] array = {1, 5, 7, 12, 13, 25, 27};
        int value = 7;
        int index = exponentialSearch(array,array.length, value);

        if (index == -1)
            System.out.println("The value is not existed in the given array");
        else
            System.out.println("the value is presented at the index =  " + index);


    }
}
