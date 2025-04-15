package BasicProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rearrange {

      //Rearrange array in increasing-decreasing order

    public static void finding(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int mid=n/2;
        for(int i=mid,j=n-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        int[] arr={5, 2, 8, 1, 4, 6, 3, 7};
        finding(arr);
    }
}
