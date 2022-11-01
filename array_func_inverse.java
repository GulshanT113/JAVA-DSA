import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static void print_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
        public static int[] inverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[arr[i]] = i;
        }

        return ans;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        //print_1();
        print_1(inverse(arr));
    }
}