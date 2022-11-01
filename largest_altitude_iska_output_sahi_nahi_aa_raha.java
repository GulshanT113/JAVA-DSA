import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i : arr){
            arr[i] = scn.nextInt();
        }
    }
    public static int largest_altitude(int[] arr){
        int sum = 0, ans = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args){
        int n= scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        System.out.println(largest_altitude(arr));
    }
}