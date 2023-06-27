package Patterns_Ques;

public class Floyd_Tirangle {
    // FLOYD'S TRIANGLE
    static void floyd_tri(int num){
        int count=1;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd_tri(5);
    }
}

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
