package Patterns_Ques;

public class Downward_triangle {
    public static void inverted_triangle(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num =5;
        inverted_triangle(num);
    }
}


// * * * * * 
// * * * *
// * * *
// * *
// *