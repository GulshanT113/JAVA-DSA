import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
    public static void print_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static int[] insertion_sort(int[] arr){ // the concept of insertion sort left to right.
        int n = arr.length;
        for(int i = 1; i < n; i++){
            while((i > 0) && (arr[i-1] > arr[i])){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(insertion_sort(arr));
    }
}