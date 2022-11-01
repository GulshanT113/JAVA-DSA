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
    public static int sum_of_raw(int[] arr){
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        return sum;
    }
    public static boolean equal_sum(int[][] arr){
        if(arr.length == 0) return true;
        int sum = sum_of_raw(arr[0]);
        for(int i = 1; i < arr.length; i++){
            int tamp = sum_of_raw(arr[i]);
            if(sum != tamp)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[][] arr = input_1();
        System.out.println(equal_sum(arr));
    }
}
