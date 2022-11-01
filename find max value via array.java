import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // write
        }
    }
     public static int maxEle(int[] arr) {
         
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //maxEle = Math.max(maxEle, arr[i]); //this is the function using method:    (you choose any one method)!!!
            maxEle = arr[i] > maxEle ? arr[i] : maxEle; // this is without using method:
        }
        return maxEle;
    } 

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        int ans = maxEle(arr);
        System.out.println("index: " + ans);
    }
}