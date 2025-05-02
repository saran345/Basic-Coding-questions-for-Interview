package BasicProgram;

import java.util.Scanner;

public class HCF {

    public static int calculateHCF(int m, int n){
        while(n!=0){
            int temp=n;
            n=m%n;
            m=temp;
 //n=4 m=5

        }
        return m;
    }

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int m=ss.nextInt();
        int n=ss.nextInt();
       int value =calculateHCF(m,n);
        System.out.println("The HCF is"+value);
    }
}
