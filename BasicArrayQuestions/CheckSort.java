package ArrayDSA;


public class CheckSort {

    public static boolean check(int[] arr) {
         int n=arr.length;   //2,3,4,1,5
         for(int i=0;i<n;i++){     // i=3 j=2
             if(arr[i]<arr[i+1]){
                 return false;
             }
         }
         return true;
    }

    public static void main(String[] args) {

          int[] arr={2,3,4,1,5};
          boolean res=check(arr);
          if(res){
              System.out.println("it is sorted!");
          }else{
              System.out.println("not sorted!");
          }
    }
}
