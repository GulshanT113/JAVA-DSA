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
    public static void print_diagonal(int[][] arr, int raw, int column){
        int n = arr.length, m = arr[0].length;
        while(raw < n && column < m){
            System.out.print(arr[raw][column] + " ");
            raw++;
            column++;
        }
        System.out.println();
    }
    public static void print_upper_diagonal(int[][] arr){
        int n = arr[0].length;
        for(int i = 0; i < n; i++){
            print_diagonal(arr, 0, i);
        }
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        print_upper_diagonal(arr);
    }
}