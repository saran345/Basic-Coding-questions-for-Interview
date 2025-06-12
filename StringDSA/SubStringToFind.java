package StringDSA;

import java.util.Scanner;

public class SubStringToFind {
    public static void main(String[] args) {
       String first="hello world!, this is my word!";
       String substring="world!";

       int postion=first.indexOf(substring);
        if(postion!=-1){
            System.out.println("String found at: "+postion);
        }else{
            System.out.println("String not found!");
        }

    }
}
