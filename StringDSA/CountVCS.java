package StringDSA;

public class CountVCS {

     // count vowels , constant , spaces;

     public static void check(String s){
          int vowel=0; int consonants=0; int space=0;
          String ss=s.toLowerCase();
          for(char ch:ss.toCharArray()){
              if(ch==' '){
                  space++;
              }else if(ch >='a' && ch<='z'){
                  if(isVowel(ch)){
                      vowel++;
                  }else{
                      consonants++;
                  }
              }
          }
         System.out.println("Vowels:"+ vowel +" "+" Consonants:"+ consonants+" "+"spaces:"+ space);
     }

    public static boolean isVowel(char ch) {
         return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';

    }

    public static void main(String[] args) {
          String s="wonderfully is good to see you";
          check(s);
    }
}
