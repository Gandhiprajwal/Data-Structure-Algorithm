package Patterns_Ques;

public class Right_triangle {
    static void right_triangle(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 5;
        right_triangle(num);
    }
}

// * 
// * *
// * * *
// * * * *
// * * * * *