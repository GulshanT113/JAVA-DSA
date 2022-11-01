import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input_1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int GCD(int[] nums){
        int arr = nums.length;
        Arrays.sort(nums);
        int i = nums[0];
        int j = nums[arr-1];
        int k = i;
        while(k > 1){
            if(j % k == 0 && i % k == 0){
                return k;
            }
            k--;
        }
        return 1;
    }
    public static void main(String[] args){
        int[] arr = input_1D();
        System.out.println(GCD(arr));
    }
}