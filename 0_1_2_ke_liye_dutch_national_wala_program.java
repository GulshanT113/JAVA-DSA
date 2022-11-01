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
        int tamp = arr[i];
        arr[i] = arr[j];
        arr[j] = tamp;
    }
    public static int[] dutch_national_flag_algo(int[] arr, int n){
        int p = -1, itr = 0, p_2 = n-1;
        while(itr <= p_2){
            if(arr[itr] == 0){
                swap(arr, itr++, ++p);
            }
            else if(arr[itr] == 1)
            itr++;
            else if(arr[itr] == 2){
                swap(arr, itr, p_2--);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        print_1(dutch_national_flag_algo(arr, n));
    }
}
