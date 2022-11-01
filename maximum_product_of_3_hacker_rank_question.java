import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bouble_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                if(arr[j-1] > arr[j])
                swap(arr, j-1, j);
            }
        }
    }
    public static int pair_mul(int[] arr, int LB, int RB){
        int num_1 = arr[RB] * arr[RB-1];
        int num_2 = arr[LB] * arr[LB+1];
        return Math.max(num_1, num_2);
    }
    public static void triple_mul(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        bouble_sort(arr);
        int n = arr.length;
        for(int i = n-1; i > 1; i--){
            int num = arr[i];
            int pair = pair_mul(arr, 0, i-1);
            max_sum = Math.max(max_sum, pair * num);
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        triple_mul(arr);
    }
}