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

    public static int[] pivotIndex(int[] arr, int[] arr_1) {
        int n = arr.length;
        int p = -1;
        int itr = 0;
        int p_2 = n-1;
        //int a = arr.length;
        int b = arr_1.length;
        int len = Math.max(n, b)+n;
        System.out.println("enter the value of data = ");
        int data = scn.nextInt();
        System.out.println("enter the value of data_1 = ");
        int data_1 = scn.nextInt();
        
        while (itr <= p_2) {
            if (arr[itr] >= data || arr_1[itr] <= data_1) {
                itr++;
            }
            else if(arr[itr] < data){
                swap(arr, itr++, ++p);
            }
            else if(arr_1[itr] > data_1){
                swap(arr, itr, p_2--);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        int m = scn.nextInt();
        int[] arr_1 = new int[m];
        input_1(arr_1);
        print_1(pivotIndex(arr, arr_1));
    }
}