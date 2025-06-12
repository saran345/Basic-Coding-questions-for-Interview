package StringDSA;

public class Palindrome {
    public static void main(String[] args) {
        String s1="hheehh";
        System.out.println("Check the String is palindrome or not:"+check(s1));

    }
    public static boolean check(String s){
          int left=0;
          int right=s.length()-1;

          while(left<right){
              if(s.charAt(left)!=s.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }
          return true;
    }
}
