package com.tahvildari.java.searchingalgorithms.sequential;

/**
 * The complexity of this algorithm is O(n) and it has less usage
 */
public class LinearSearch {
    public static int search(int[] array , int x)
    {
        int size = array.length;
        for(int i =0; i < size ; i++)
        {
            if(array[i] == x)
                return x;
        }
        return -1;

    }


    public static void main(String args[])
    {
        int[] array = {1,7,9,12,3,12};
        int value = 3;
        int index = search(array, value);
        if(index == -1 )
            System.out.println("The value is not existed in the given array");
        else
            System.out.println("the value is presented at the index =  " + index);


    }
}
