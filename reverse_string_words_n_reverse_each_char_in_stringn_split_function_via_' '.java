import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void swap_string(String[] arr, int i, int j){
        String tamp = arr[i];
        arr[i] = arr[j];
        arr[j] = tamp;
    }
    public static void swap_char(char[] arr, int i, int j){
        char tamp = arr[i];
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
        String[] arr = str.split(" ");
        reverse_string(arr);
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if (i != n - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
    public static String reverse_string_after_each_char(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            swap_char(arr, i++, j--);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        // System.out.println(reverse_string_array(str));
        System.out.println(reverse_string_after_each_char(str));
    }
}