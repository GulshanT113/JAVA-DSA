import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void print_1D(int[] arr){
        for(int i : arr)
        System.out.print(i + " ");
    } 
    public static void scan_1D(int[] arr){
        for(int i=0;i<arr.length;i++) 
        arr[i] =scn.nextInt();
    }
    public static void absolute_Matrix(int[] arr){
        int new_Arr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr.length; j++){    
                if((arr[i]-arr[j]) >= 0) 
                sum += arr[i] - arr[j];
                else 
                sum -= arr[i] - arr[j];
            }  
            new_Arr[i] = sum;
        }
        print_1D(new_Arr);  
    }
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = new int[size];
        scan_1D(arr);
        absolute_Matrix(arr);
    }
}