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
    }
    public static int[] merge_arrs(int[] A, int[] B) {
        int n = A.length, m = B.length;
        if (n == 0 || m == 0)
            return n != 0 ? A : B;
        int len = n + m;
        int[] ans = new int[len];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(A[i] < B[j]){
                ans[k++] = A[i++];
            }
            else
            ans[k++] = B[j++];
        }

        while(i < n){
            ans[k++] = A[i++];
        }

        while(j < m){
            ans[k++] = B[j++];

        }
        return ans;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        int m = scn.nextInt();
        int[] arr_1 = new int[m];
        input_1(arr_1);
        int[] A_B = merge_arrs(arr, arr_1);
        print_1(A_B);
    }
}