package ArrayDSA;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestArray {

    public static void smallest(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest number :"+min);
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
        smallest(arr);
    }
}
