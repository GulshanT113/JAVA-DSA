import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    
    public static int findDiffrence_02(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // for each loop bas value get kr sakta h usme koi update ya change
        // nhi kar skta matlab only it can get not anything set because
        // yeh index access nahi kar skta only value access kar skta hai.
        for (int ele : arr) {
            max = Math.max(max, ele);
            min = Math.min(min, ele);
        }
            // hum isko for each loop se bhi kar sakte or jis traha se krte
            // aaye h vse bhi kar skte hai.
        // for(int i = 0; i < arr.length;i++){
        // max = Math.max(max, arr[i]);
        // min = Math.min(min, arr[i]);
        // }

        return max - min;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        System.out.println(findDiffrence_02(arr));
    }
}