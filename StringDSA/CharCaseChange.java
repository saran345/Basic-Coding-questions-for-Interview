package StringDSA;

public class CharCaseChange {
    public static void main(String[] args) {
        String s="Hello World!";

        StringBuilder result=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
