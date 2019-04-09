package com.tahvildari.java.searchingalgorithms.Interval;

// InterpolationSearch is used when the sorted algorithm contains uniformly distributed values
// this is improvement of BinarySearch since in BinarySearch the algorithm analyze and divide
// array base on middle element, but in InterpolationSearch, the algorithm will focus on the index
// which probably contain the closer to the intended searched value
// if the elements are uniformly distributed time complexity is O(log log n),otherwise; in the worst case is O(n) ,
public class interpolationSearch {

    static int interpolationSearch(int[] array, int value) {

        int low = 0;
        int high = array.length - 1;

        // Since the searched value always should be in the domain of  determined subarray
        // and lower index should be equal less than higher index
        while (low <= high && value >= array[low] && value <= array[high]) {
            if (low == high) {
                if (array[low] == value)
                    return low;
                return -1;
            }

            int probe = low + (((high - low) * (value - array[low])) / (array[high] - array[low]));

            if (array[probe] == value)
                return probe;

            if (array[probe] > value)
                high = probe - 1;


            else
                low = probe + 1;

        }
        return -1;
    }
}