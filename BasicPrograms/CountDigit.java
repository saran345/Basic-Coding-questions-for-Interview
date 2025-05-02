package BasicProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDigit {
    public static void main(String[] args) {
        try{
            System.out.println("Enter the number:");
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(in);
            String input=bf.readLine();
            int n=Integer.parseInt(input);
            int count=0;
            while(n>0){

                n/=10;
                count++;
            }
            System.out.println("the count of digit :"+count);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
