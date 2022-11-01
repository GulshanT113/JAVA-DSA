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
    //selection sort mai sabse small element initial index per lga do 0'th index per.
    public static int[] selection_sort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
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
        print_1(selection_sort(arr));
    }
}