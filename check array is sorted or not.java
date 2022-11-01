import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
    
    public static boolean input_check(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                System.out.println("No");
                return false;
            }
        }
        System.out.println("Yes");
        return true;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr); 
        input_check(arr);
    }
}