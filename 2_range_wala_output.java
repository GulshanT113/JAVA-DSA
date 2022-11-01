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
        int n = arr.length, p1 = -1, itr = 0, p2 = n - 1;
        int leftDataB = scn.nextInt();
        int rightDataB = scn.nextInt();
        while (itr <= p2) {
            if(arr[itr] < leftDataB)
            swap(arr, itr++, ++p1);
            
            else if(arr[itr] >= leftDataB && arr[itr] <= rightDataB)
            itr++;
            
            else if(arr[itr] > rightDataB)
            swap(arr, itr, p2--);
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