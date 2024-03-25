package arrays.multidimentionalArray;

public class TwoDimentionalArray {

//    public static void main(String[] args) {
//        int arr[][] = {{1,2,3,8,9},{ 4,5,6}};
//     //   System.out.println(arr.length);  //row
//     //   System.out.println(arr[0].length); //column
////        for(int i =0;i< arr.length;i++){
////            for(int j =0;j<arr[i].length;j++){
////                System.out.print(arr[i][j]+ " ");
////            }
////            System.out.println();
////        }
//
//        printMatrixInSnakePattern(arr);
//    }
////    public static void main(String[] args) {
////        int m = 3;
////
////        int arr[][] = new int[m][];
////
////        for(int i =0;i< arr.length;i++){
////            arr[i] = new int [i+1];
////            for(int j =0;j<arr[i].length;j++){
////                arr[i][j]= i;
////                System.out.print(arr[i][j] +" ");
////            }
////            System.out.println();
////        }
////    }
//
//        // TODO: Print a matrix in a snake pattern
//    public static void printMatrixInSnakePattern(int mat[][]){
//
//        for(int i =0;i< mat.length;i++){
//            if(i % 2==0){
//                for(int j =0;j<mat[i].length;j++){
//                    System.out.print(mat[i][j] +" ");
//                }
//                System.out.println();
//            }else{
//                for(int j = mat[i].length-1;j>=0;j--){
//                    System.out.print(mat[i][j] +" ");
//                }
//            }
//        }
//    }
// TODO --------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //   printMatrix(arr);
        snakePattern(arr);
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] mat, int row, int col) {
        int temp = mat[row][col];
        mat[row][col] = mat[col][row];
        mat[col][row] = temp;
    }

    public static void transposeMatrix(int[][] mat) {
        int transpose[][] = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transpose[i][j] = mat[j][i];
            }
        }
        printMatrix(transpose);
    }

    public static void snakePattern(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++)
                    System.out.print(mat[i][j] + " ");
            } else {
                for (int j = col - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void matrixBoundryTravarsal(int[][] mat,int m,int n){




    }


}
