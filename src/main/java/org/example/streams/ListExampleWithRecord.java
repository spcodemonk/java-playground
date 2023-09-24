package org.example.streams;

import java.util.Arrays;

public class ListExampleWithRecord {
    /**
     * Given an unsorted integer array of nums, return the smallest missing positive integer. Don't use in-built functions, interfaces or classes.
     * Input: nums = [1,2,0]
     * Output: 3
     *
     *
     *
     * Input: nums = [7,8,9,11,12]
     * Output: 1
     *
     *
     *
     * Input: nums = [3,4,-1,1]
     * Output: 2
     * @param args
     */

    /**
     * step 1 sort it. 0,1,2;
     * step 2. loop it for num >0 and kepp incrementing the element by 1 , at each iteration number should match other wise return
     * @param args
     */
    public static void main(String[] args) {
        int arr[] ={2,1};

        if(!(arr.length >0)){
            return;
        }

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int counter=0;
        int temp = arr.length-1;

        while(counter<arr.length){

            if(arr[counter]<=0){
                counter++;
                continue;
            }

            if( !(counter+1<arr.length && arr[counter+1]-1 == arr[counter])){
                System.out.println("Missing positive integer "+ (arr[counter]+1));
                break;
            }
            counter++;
        }

//        System.out.println(arr[2]);
    }
}

