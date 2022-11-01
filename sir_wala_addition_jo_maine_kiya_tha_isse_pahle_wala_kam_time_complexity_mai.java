import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    
    public static void prefixArray(int[] arr, int q) {
        int n = arr.length;
        int[] p_arr = new int[n+1];
        for(int i = 0; i < n; i++){
            p_arr[i+1] = p_arr[i] + arr[i];
        }
        while (q-- > 0) {
            int lr = scn.nextInt(), rr = scn.nextInt();
            int sum = p_arr[rr+1] - p_arr[lr];
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