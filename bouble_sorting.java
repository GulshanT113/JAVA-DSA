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
    // bouble sort mai biggest element ko last location per set kar do.
    public static int[] bouble_sort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        System.out.println("before sorting :");
        print_1(arr);
        System.out.println("after sorting = ");
        print_1(bouble_sort(arr));
    }
}