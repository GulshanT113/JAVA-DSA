import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input_1(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void print_1(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void swap_2D(int[][] arr, int i_1, int j_1, int i_2, int j_2){
        int tamp = arr[i_1][j_1];
        arr[i_1][j_1] = arr[i_2][j_2];
        arr[i_2][j_2] = tamp;
    }
    public static void swap_column(int[][] arr, int c_1, int c_2){
        for(int i = 0; i < arr.length; i++){
            swap_2D(arr, i, c_1, i, c_2);
        }
    }
    public static void swap_raw(int[][] arr, int r_1, int r_2){
        int[] tamp = arr[r_1];
        arr[r_1] = arr[r_2];
        arr[r_2] = tamp;
    }
    public static int[][] reverse_column(int[][] matrix){
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m-1;
        while(i < j){
            swap_column(matrix, i++, j--);
        }
        return matrix;
    }
    public static int[][] reverse_raw(int[][] matrix){
        int n = matrix.length; // m = matrix[0].length;
        int i = 0, j = n-1;
        while(i < j){
            swap_raw(matrix, i++, j--);
        }
        return matrix;
    }
    public static int[][] transpose(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[i].length; j++){
                swap_2D(matrix, i, j, j, i);
            }
        }
        return matrix;
    }
    public static int[][] clock_90_degree(int[][] matrix){
        transpose(matrix);
        reverse_column(matrix);
        
        return matrix;
    }
    public static int[][] anti_clock_90_degree(int[][] matrix){
        transpose(matrix);
        reverse_raw(matrix);
        
        return matrix;
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        print_1(anti_clock_90_degree(arr));
    }
}
