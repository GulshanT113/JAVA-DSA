import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // write
        }
    }
     public static int minEle(int[] arr) {
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minEle = Math.min(minEle, arr[i]); //this is the function using method:    (you choose any one method)!!!
            //minEle = arr[i] < minEle ? arr[i] : minEle; // this is without using method:
        }
        return minEle;
    } 
    

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        int ans = minEle(arr);
        System.out.println("index: " + ans);
    }
}