package Patterns_Ques;

public class Hollow_Rhombus {
    // HOLLOW RHOMBUS
    static void hollow_rhombus(int num){

        for (int i=0;i<num;i++){
            // spaces
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }

            // hollow rectangle
            for(int j=0;j<num;j++){
               if(i==0 || i==num-1 || j==0 || j==num-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}


//      *****
//     *   *
//    *   *
//   *   *
//  *****
