package StringDSA;

public class RotateString {
    public static void main(String[] args) {
        String s="hello";
        String d="llohe";
        System.out.println(check(s,d));
    }
    public static boolean check(String s, String d){
        if(s.length()!=d.length()) return false;

        return (s+s).contains(d);
    }
}
