package BasicProgram;

  //Write a Program to Reverse an Array

import java.util.Arrays;

public class Reverse {
    public static void reversing(int[] arr) {
        int left=0; int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reversing(arr);
    }
}
