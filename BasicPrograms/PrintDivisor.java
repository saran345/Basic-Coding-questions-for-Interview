package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintDivisor {

    public static void PrintValue(int n){
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
       try{
           InputStreamReader in =new InputStreamReader(System.in);
           BufferedReader bf=new BufferedReader(in);
           System.out.println("Enter the number:");
           int n=Integer.parseInt(bf.readLine());
           PrintValue(n);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
