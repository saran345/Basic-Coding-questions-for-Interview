package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArmStrong {
    public static boolean calculateArm(int n){
        int res=0;
        int original=n;
        int value1=String.valueOf(n).length();
        while(n!=0){
            int rem=n%10;
            res+=Math.pow(rem,value1);
            n/=10;
        }
        return original==res;
    }

    public static void main(String[] args) {
       try{
           InputStreamReader in=new InputStreamReader(System.in);
           BufferedReader bf=new BufferedReader(in);
           System.out.println("Enter the Armstrong number:");
           int n=Integer.parseInt(bf.readLine());
           boolean res=calculateArm(n);
           if(res){
               System.out.println("Armstrong number");
           }else{
               System.out.println("Not a Armstrong number");
           }
       }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
