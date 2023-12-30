package Array_2D;

public class Spiral_Matrix {
    public static void spiralMatrix(int[][] arr, int row,int col) {
        int startRow = 0;
        int startCol = 0;
        int endRow = row-1;
        int endCol = col-1;
        
        while(startRow<=endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralMatrix(arr, arr.length,arr[0].length);
    }
}
