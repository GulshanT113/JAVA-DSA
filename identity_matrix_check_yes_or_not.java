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
    public static int[][] print_1(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println();
            }
        }
        return arr;
    }
    public static boolean check_identity(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j && arr[i][j] != 1){
                    return false;
                }
                else if(i != j && arr[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        System.out.println(check_identity(arr));
    }
}
