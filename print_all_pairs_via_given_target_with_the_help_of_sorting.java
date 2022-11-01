import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void print_1(int[] arr){
        System.out.println("after sorting the array:");
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
        
        System.out.println();
    }

    public static void printAllPairs(int[] arr, int target) {
        Arrays.sort(arr);
        print_1(arr);
        int n = arr.length;
        int lr = 0;
        int rr = n-1;
        while (lr < rr) {
            int sum = arr[lr] + arr[rr];
            if (sum == target) {
                System.out.println("[" + arr[lr] + ", " + arr[rr] + "]" + " = " + "[" + lr + ", " + rr + "]");
                lr++;
                rr--;
            } else if (sum < target) {
                lr++;
            } else {
                rr--;
            }
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        printAllPairs(arr, scn.nextInt());
    }

}