import java.util.*;
public class solution{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        return arr;
    }
    public static int trapping(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            int left = arr[i];
            for(int j = 0; j < i; j++)
                left = max(left, arr[j]);
            int right = arr[i];
            for(int j = i+1; j < arr.length; j++)
                right = max(right, arr[j]);
            res += min(left, right)-arr[i];
        }
        return res;
    }
    public static int min(int i, int j){
        return i < j ? i : j;
    }
    public static int max(int i, int j){
        return i > j ? i : j;
    }
    public static void main(String[] args){
        int[] arr = input1D();
        System.out.println(trapping(arr));
    }
}