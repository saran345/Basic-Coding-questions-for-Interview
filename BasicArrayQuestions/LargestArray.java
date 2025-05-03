package ArrayDSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class LargestArray {

     public static void check(int[] arr){
         int n=arr.length;
         int max=arr[0];
         for(int i=0;i<n;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
         }
         System.out.println("The largest number is"+max);
     }

    public static void main(String[] args) {
       try{
           InputStreamReader in=new InputStreamReader(System.in);
           BufferedReader bf=new BufferedReader(in);
           System.out.println("Enter the length:");
           int n=Integer.parseInt(bf.readLine());
           System.out.println("Enter the Array Number:");
           int[] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=Integer.parseInt(bf.readLine());
           }
           check(arr);

       }catch(Exception e){
           System.out.println(e.getMessage());
       }

    }
}
