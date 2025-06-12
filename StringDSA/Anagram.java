package StringDSA;

public class Anagram {
    public static void main(String[] args) {
        String s="hello";
        String f="olleh";
        System.out.println("Check it is anagram or not?"+isCheck(s,f));
    }

    public static boolean isCheck(String s, String f) {
         int[]  count=new int[26];
         for(int i=0;i<s.length();i++){
             count[s.charAt(i)-'a']++;
             count[f.charAt(i)-'a']--;
         }
         for(int g:count){
             if(g!=0) return false;
         }
         return true;
    }
}
