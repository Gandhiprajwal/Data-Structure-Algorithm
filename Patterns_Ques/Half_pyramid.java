package Patterns_Ques;
public class Half_pyramid {
    public static void pyramid(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num =5;
        pyramid(num);
    }
}

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 