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
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] pivotIndex(int[] arr){
        int n = arr.length, p_1 = -1, itr = 0, p_2 = n - 1;
        int LD = scn.nextInt();
        int RD = scn.nextInt();
        while (itr <= p_2) {
            if(arr[itr] <= LD)
            swap(arr, itr++, ++p_1);
            
            else if(arr[itr] > LD && arr[itr] < RD)
            itr++;
            
            else if(arr[itr] >= RD)
            swap(arr, itr, p_2--);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(pivotIndex(arr));
    }
}