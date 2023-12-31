package Practice;

public class _20_Circular_Rotation {
    public static void main(String[] args) {
        String s = "ABCDEF";
        System.out.println(rotateString(s, 3));
        System.out.println(isrotation("ABCDEF","DEFABC"));
    }

    public static String rotateString(String t,int i){
        return t.substring(i,t.length()) + t.substring(0, i);
    }

    public static boolean isrotation(String a, String b) {
        return a.length() == b.length() && (a+a).contains(b);
    }
}
