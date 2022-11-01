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
    public static void pair_sum(int[] arr, int target, int LB, int RB, int num_1){
        while(LB < RB){
            int sum = arr[LB]+arr[RB];
            if(sum == target){
                System.out.println("[" + num_1 + ", " + arr[LB++] + ", " + arr[RB--] + "]");
            }
            else if(sum < target)
            LB++;
            else
            RB--;
        }
    }
    public static void three_sum(int[] arr, int target){
        int n = arr.length;
        bouble_sort(arr);
        for(int i = 0; i < n; i++){
            pair_sum(arr, target-arr[i], i+1, n-1, arr[i]);
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        three_sum(arr, scn.nextInt());
    }
}