import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[][] arr){
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println();
    }
    public static void print_1(int[][] arr){
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input_1(arr);
        print_1(arr);
    }
}