package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD {
    public static int calculateGCD(int m, int n){
        while(m>0 && n>0){
            if(m>n){
                m=m%n;
            }else{
                n=n%m;
            }
        }
        if(m==0){
            return n;
        }
        return m;
    }
    public static void main(String[] args) {
        try{
            System.out.println("Enter the number:");
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(in);
//           String input=bf.readLine();
            int n=Integer.parseInt(bf.readLine());
            int m=Integer.parseInt(bf.readLine());
            int value=calculateGCD(m,n);
            System.out.println(value);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
