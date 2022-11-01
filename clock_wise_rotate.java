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
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void reverseInRange(int[] arr, int lb, int rb) {
        while (lb < rb) {
            swap(arr, lb++, rb--);
        }
    }

    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        
        reverseInRange(arr, 0, k - 1);
        reverseInRange(arr, k, n - 1);
        reverseInRange(arr, 0, n - 1);
        
        return arr;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(rotate(arr, scn.nextInt()));
    }
}