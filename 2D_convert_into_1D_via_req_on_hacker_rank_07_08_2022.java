import java.util.*;
public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1D(int arr[]){
        for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
    }  
    public static int[][] input_2D(int n){
        int arr[][] = new int[n][n];
        for(int i[]:arr) input_1D(i);
        return arr;
    }  
    public static void print_1D(int arr[]){
        for(int i : arr)
            System.out.print(i+ " ");
    } 
    public static void print_2D(int arr[][]){
        for(int i[] : arr){
            print_1D(i);
            System.out.println();
        }
    }  
    public static void swap_2D(int arr[][] , int i_1 , int j_1, int i_2, int j_2){
        int temp = arr[i_1][j_1];
        arr[i_1][j_1] = arr[i_2][j_2];
        arr[i_2][j_2] = temp;
    }   
    public static void columnSwap(int arr[][] , int c_1 , int c_2){
        for(int i = 0; i < arr.length; i++){
            swap_2D(arr, i, c_1, i, c_2);
        }
    } 
    public static int[][] transpose_2D(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1 ; j<arr[0].length;j++){
                swap_2D(arr , i, j, j, i);
            }
        }
        return arr;
    } 
    public static int[][] column_Reverse(int arr[][]){
        int i=0,j=arr[0].length-1;
        while(i<j){
            columnSwap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        print_2D(column_Reverse(transpose_2D(input_2D(scn.nextInt()))));
    }
}