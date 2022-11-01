import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static void output_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int n){
        int i, temp;
        for(i = 0; i < n/2; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
  
    public static void main(String[] args)
    {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        reverse(arr, n);
        output_1(arr);
    }
}