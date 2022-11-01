import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void inter_section(int[] arr, int[] arr_1){
        int n = arr.length;
        int m = arr_1.length;
        if(n == 0 && m == 0)
        return;
        int i = 0, j = 0;
        while(i<n && j<m){
            if(arr[i] == arr_1[j]){
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
            else if(arr[i] < arr_1[j])
            i++;
            else
            j++;
        }
    }
    public static void main(String args[]) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        int m = scn.nextInt();
        int[] arr_1 = new int[m];
        input_1(arr_1);
        inter_section(arr, arr_1);
    }
}