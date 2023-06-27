package project_03;

import java.util.Arrays;

public class Fibonacci {

    /*
    Fibonacci is sum of two (2) previous number
    first ten numbers of fibonacci

    no need to create a method, do it inside the main method
     -> 0,1,1,2,3,5,8,13,21,34
        [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
               f  s

     */

    public static void main(String[] args) {

        // break

        int[] fibonacci=new int[10];

        int first=0;
        int second=1;

        fibonacci[0]=first;
        fibonacci[1]=second;

        for (int i = 2; i < 10; i++) {
            fibonacci[i]=first+second;//1-->2-->3
            first=second;//0-->1-->1-->2
            second=fibonacci[i];//1-->1-->2-->3
        }

        System.out.println(Arrays.toString(fibonacci));




    }


}
