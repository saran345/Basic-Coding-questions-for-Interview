package StringDSA;

public class ReverseWord {

    public static void main(String[] args) {
        String s="hello world!";

        String e=check(s);
        System.out.println(e);

        opti();
    }

    public static String check(String s) {
         String[] word=s.split(" ");
         String  result="";
         for(String w:word){
             String reverse=" ";

             for(int i=w.length()-1;i>=0;i--){
                   reverse+=w.charAt(i);
             }
             result+=reverse+" ";


         }
         return result.trim();
    }

    public static void opti(){

        String word="This is my heartQ";
        StringBuilder result=new StringBuilder();
        StringBuilder count=new StringBuilder();
        for(char ch:word.toCharArray()){
            if(ch!=' '){
                count.append(ch);
            }else{
                result.append(count.reverse()).append(" ");
                count.setLength(0);
            }
        }
        if(count.length()>0){
            result.append(count.reverse());
        }
        System.out.println(result.toString());
    }
}

/*

 String s="hello world";
 StringBuilder s=new StringBuilder(s);

System.out.println(s.reverse());

 */