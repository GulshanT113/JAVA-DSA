import java.util.*;
public class solution{
    public static Scanner scn = new Scanner(System.in);
    public static void swap_string(String[] arr, int i, int j){
        String tamp = arr[i];
        arr[i] = arr[j];
        arr[j] = tamp;
    }
    public static void reverse_string(String[] arr){
        int n = arr.length, i = 0, j = n-1;
        while(i < j){
            swap_string(arr, i++, j--);
        }
    }
    public static String reverse_string_array(String str) {
        str = str.replaceAll("( )+", " ");
        String[] arr = str.split(" ");
        reverse_string(arr);
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if (i != n - 1){
                sb.append(" ");
            }    
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(reverse_string_array(str));
    }
}