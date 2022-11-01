import java.util.*;

public class Main {
    
    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // write
        }
    }


    public static int findElement(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        int ans = findElement(arr, scn.nextInt());
        System.out.println("index: " + ans);
    }
}