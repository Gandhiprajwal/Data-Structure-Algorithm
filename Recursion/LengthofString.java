package Recursion;

public class LengthofString {
    public static int lengthString(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return lengthString(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(lengthString("null"));
    }
}
