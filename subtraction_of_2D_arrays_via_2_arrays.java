import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void print_1(int[][] arr, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] add_2D(int[][] arr, int[][] arr_1, int n, int m) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] -= arr_1[i][j];
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input_1(arr, n, m);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int[][] arr_1 = new int[a][b];
        input_1(arr_1, a, b);
        add_2D(arr, arr_1, n, m);
        print_1(arr, n, m);
    }
}