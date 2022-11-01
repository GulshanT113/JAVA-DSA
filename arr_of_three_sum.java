import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }

    public static void printAllPairs(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int lr = 0;
        int rr = n-1;
        while (lr < rr) {
            int mid = ((arr[lr] + arr[rr])/2)+1;
            int sum = arr[lr] + arr[mid] + arr[rr];
            if (sum == target) {
                System.out.println("(" + lr + ", " + mid + ", "+ rr + ") ");
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