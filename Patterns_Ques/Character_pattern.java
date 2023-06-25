package Patterns_Ques;

public class Character_pattern {
    public static void char_pattern(int num) {
        int ch = 65;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num =5;
        char_pattern(num);
    }
}

// A 
// B C
// D E F
// G H I J
// K L M N O