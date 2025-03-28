package BasicProgram;

import java.util.HashMap;
import java.util.Map;

    //Program to Count the Frequence of Element in Array

public class CountFreq {

     public static void count(int[] arr){
         Map<Integer,Integer> freq=new HashMap<>();

         for(int num:arr){
             freq.put(num,freq.getOrDefault(num,0)+1);
         }
         for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
             System.out.println(entry.getKey()+" ->"+entry.getValue());
         }

     }

    public static void main(String[] args) {
        int[] arr={1,2,1,2,4,3,4,3,5,6,7,6};
         count(arr);
    }

}
