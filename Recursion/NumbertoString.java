package Recursion;

public class NumbertoString {
    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numbertoString(int num) {
        if (num == 0) {
            return;
        }
        int number = num % 10;
        System.out.print(digit[number] + " ");
        numbertoString(num / 10);
    }

    public static void main(String[] args) {
        numbertoString(1234);
    }
}
