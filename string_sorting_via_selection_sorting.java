import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static char[] selection_sort(char[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }
    public static String string_sorting(String str){
        char[] arr = str.toCharArray();
        selection_sort(arr);
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.println(string_sorting(str));
    }
}