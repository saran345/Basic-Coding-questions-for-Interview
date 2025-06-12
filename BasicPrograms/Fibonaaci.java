package BasicProgram;

import java.util.Scanner;


public class Fibonaaci {
    public static int fibo(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void iterative(int n){
         int first=0; int second=1;

        System.out.println("Fibonaaci series using iterative method");
        int i=0;
        while(i<n){
            System.out.print(first+" ");
           int next=first+second;
           first=second;
           second=next;
           i++;
        }

    }

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter the number");
        int n=ss.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
        System.out.println();

        //iterative method
        iterative(n);
    }
}
