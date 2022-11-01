import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void print_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
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
    public static int[] pair_mul(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        bouble_sort(arr);
        return arr;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(pair_mul(arr));
    }
}