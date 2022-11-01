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
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else{
                for(int j = m-1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }    
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        snake_matrix(arr);
    }
} 