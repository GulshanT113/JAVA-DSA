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
    public static boolean check_symmetric(int[][] arr){
        if(arr.length != arr[0].length)
        return false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[i].length; j++){
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        System.out.println(check_symmetric(arr));
    }
}