package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {

     public static boolean check(int n){

         if(n<=1){
             return false;
         }
         for(int i=2;i*i<=n;i++){
             if(n%i==0){
                 return false;
             }
         }
         return true;
     }


    public static void main(String[] args) {
       try{
           InputStreamReader in =new InputStreamReader(System.in);
           BufferedReader bf=new BufferedReader(in);
           System.out.println("Enter the number");
           int n=Integer.parseInt(bf.readLine());
           System.out.println(check(n));

       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
