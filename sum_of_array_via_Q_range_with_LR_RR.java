import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    /*public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        System.out.println(arr[i] + " ");
    }*/
    
    public static int sum_pair(int[] arr, int lr, int rr){
        int sum = 0;
        for(int i = lr; i <= rr; i++){
            sum += arr[lr++];
        }
        return sum;
    }
    
    public static void prefixArray(int[] arr, int q) {
        while (q-- > 0) {
            int lr = scn.nextInt(), rr = scn.nextInt();
            int sum = sum_pair(arr, lr, rr);
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        prefixArray(arr, scn.nextInt());
    }
}