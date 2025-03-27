package BasicProgram;

  //Write a Program to find largest number in array

public class Largest {

     public static void findLarge(int[] arr){
         int large=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>large){
                 large=arr[i];
             }
         }
         System.out.println("The Largest Number is:"+" "+large);
     }

    public static void main(String[] args) {
      int[] arr=new int[]{45,2,13,67,44,899};
      findLarge(arr);
    }
}
