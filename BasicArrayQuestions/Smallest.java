package BasicProgram;

 // write a program to find the smallest number in array


public class Smallest {

    public static void findsmall(int[] arr){
        int s=arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<s){
                s=arr[i];
            }
        }
        System.out.println("The Smallest Number is :"+" "+s);
    }

    public static void main(String[] args) {
         int[] arr=new int[]{10,20,55,32,11,65};
         findsmall(arr);

    }
}

