package StringDSA;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String s="hello world...";
        System.out.println(s);
        change(s);
    }
    public static void change(String s){
        int left=0;
        int right=s.length()-1;
        char[] ss=s.toCharArray();
        while(left<right){
             char temp=ss[left];
             ss[left]=ss[right];
             ss[right]=temp;
             left++;
             right--;
        }
        System.out.println(new String(ss));
    }
}
