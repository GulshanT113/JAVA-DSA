import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    
    public static int getMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            // max = ele > max ? ele : max;
            max = Math.max(ele, max);
        }
        return max;
    }
    
    public static int getMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            // max = ele > max ? ele : max;
            min = Math.min(ele, min);
        }
        return min;
    }
    
    public static int find_element(int[] arr){
        int max = getMaximum(arr);
        int min = getMinimum(arr);
        
        return max-min;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        System.out.println(find_element(arr));
    }
}