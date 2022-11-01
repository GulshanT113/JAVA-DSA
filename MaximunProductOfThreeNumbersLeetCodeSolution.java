import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int MaxProThree(int[] arr){
        Arrays.sort(arr);
        int mul = 1;
        int n = arr.length;
        if(arr[0]*arr[1]*arr[n-1] < arr[n-1]*arr[n-2]*arr[n-3])
        mul = arr[n-1]*arr[n-2]*arr[n-3];
        else if(arr[0] > 0)
        mul = arr[n-1]*arr[n-2]*arr[n-3];
        else if(arr[0] < 0 && arr[n-1] < 0)
        mul = arr[n-1]*arr[n-2]*arr[n-3];
        else
        mul = arr[0]*arr[1]*arr[n-1];
        return mul;
    }
    public static void main(String[] args) {
        int[] arr = input1D();
        System.out.println(MaxProThree(arr));
    }
}