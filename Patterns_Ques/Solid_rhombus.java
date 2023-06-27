package Patterns_Ques;

public class Solid_rhombus {
    // SOLID RHOMBUS
    static void solid_rhombus(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
    }
}


//     *****
//    *****
//   *****
//  *****
// *****