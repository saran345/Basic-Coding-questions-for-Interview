package BasicProgram;

  //Write a Program to find Second Largest and Second Smallest Number in Array


public class SecondSL {

    public static void SecondSmall(int[] arr){
         int min=arr[0];
         int second=arr[0];

         for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                 second=min;
                 min=arr[i];
             }else if(arr[i]<second && arr[i]!=min){
                 second=arr[i];
             }
         }
        System.out.println("The Second Small Number :"+" "+second);
     }

     public static void SecondLarge(int[] arr){
         int max=arr[0];
         int first=arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 first=max;
                 max=arr[i];
             }else if(arr[i]>first && arr[i]!=max){
                 first=arr[i];
             }
         }
         System.out.println("The Second Large Number:"+" "+first);
     }



    public static void main(String[] args) {
        int[] arr={23,44,11,2,3,55,67,88};
        SecondSmall(arr);
        SecondLarge(arr);
    }
}
