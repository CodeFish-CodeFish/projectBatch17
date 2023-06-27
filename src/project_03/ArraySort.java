package project_03;

import java.util.Arrays;

public class ArraySort {

    /*
    create a method with return type
    int [] this method should sort an array
     */

    public static void main(String[] args) {
        ArraySort sort = new ArraySort();

        int [] nums = {3,4,1,2};
        int [] arrays = sort.Sort(nums);
        System.out.println(Arrays.toString(arrays));

    }

    public int [] Sort(int [] unsorted){
// [6,5,4,3,2,1]
        for (int i = 0; i < unsorted.length; i++) {
            int temp = 0;
            for (int j = i+1; j < unsorted.length; j++) {
                if (unsorted[i] > unsorted[j]){
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }

            }

        }

        return unsorted;
    }


}
