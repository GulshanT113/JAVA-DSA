import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input_2d(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void palindromic_rows(int[][] arr){
        int n = arr.length, m = arr[0].length, c=0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 1; j++){
                if(arr[i][j] == arr[i][m-1])
                    c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args){
        int[][] arr = input_2d();
        palindromic_rows(arr);
    }
}