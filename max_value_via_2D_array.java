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
    public static int maxEle(int[][] arr, int n, int m) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                //maxEle = Math.max(maxEle, arr[i]); //this is the function using method:    (you choose any one method)!!!
                maxEle = arr[i][j] > maxEle ? arr[i][j] : maxEle; // this is without using method:
            }
        }
        return maxEle;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input_1(arr, n, m);
        System.out.println(maxEle(arr, n, m));
    }
}