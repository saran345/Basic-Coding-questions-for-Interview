package ArrayDSA;

import java.util.Arrays;
import java.util.Scanner;

public class SeconLS {

    public static void SecondSmallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int large = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                max = large;
                large = arr[i];
            } else if (arr[i] > max && arr[i] != large) {
                max = arr[i];
            }

        }
        System.out.println("The Second largest is" + max);
    }

    public static void SecondLargest(int[] arr){
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int small = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                min=small;
                small = arr[i];
            } else if (arr[i] < min && arr[i] != small) {
                min = arr[i];
            }

        }
        System.out.println("The Second smallest is" + min);
    }

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Length:");
        int n=ss.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number of Array:");
        for(int i=0;i<n;i++){
            arr[i]=ss.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        SecondSmallest(arr);
        System.out.println();
        SecondLargest(arr);
    }
}
