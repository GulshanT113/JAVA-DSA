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
    public static void snake_matrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i % 2 == 0)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print(arr[i][arr[i].length-j-1] + " ");
            }
            System.out.println();
        }
    }
    public static void swap2D(int[][] arr, int i_1, int j_1, int i_2, int j_2){
        int tamp = arr[i_1][j_1];
        arr[i_1][j_1] = arr[i_2][j_2];
        arr[i_2][j_2] = tamp;
    }
    public static int[][] transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[i].length; j++){
                swap2D(arr, i, j, j, i);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        transpose(arr);
        snake_matrix(arr);
    }
}