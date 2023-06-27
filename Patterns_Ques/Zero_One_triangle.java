package Patterns_Ques;

public class Zero_One_triangle {
    // 0-1 TRIANGLE
    static void zero_one_tirangle(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one_tirangle(5);
    }
}


// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1 