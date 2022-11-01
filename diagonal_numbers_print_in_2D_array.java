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
    public static void maxEle(int[][] arr, int n, int m) {
        System.out.println("diagonal numbers --->");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input_1(arr, n, m);
        maxEle(arr, n, m);
    }
}