package Array_2D;

import java.util.Scanner;

public class initialization {
    public static void twoD_Array(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }

    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        twoD_Array();
    }
}
