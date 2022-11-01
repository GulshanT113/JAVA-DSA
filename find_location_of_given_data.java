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

    public static int[] pivotIndex(int[] arr, int data) {
        int n = arr.length, p = -1, itr = 0;
        int idx = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                idx = i;
                break;
            }
        }
        swap(arr, idx, n - 1);

        while (itr < n) {
            if (arr[itr] <= data) {
                swap(arr, itr, ++p);
            }
            itr++;
        }
        System.out.println(p);
        return arr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(pivotIndex(arr, scn.nextInt()));
    }
}