import java.util.*;
public class Main{
    public static void func(int[] arr){
        int sum = 0;
        int[] ans = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            sum = 0;
            for(int j = i; j >= 0; j--){
                sum += arr[j];
                // System.out.print(arr[j] + " ");
            }
            ans[i] = sum;
            // System.out.println();
        }
        // for(int i = 0; i < ans.length; i++)
        // System.out.print(ans[i] + " ");
        // System.out.println();
        Arrays.sort(ans);
        System.out.println(ans[ans.length-1]);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
        func(arr);
    }
}