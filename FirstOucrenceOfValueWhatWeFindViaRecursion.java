import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
        return arr;
    }
    public static int SubSeq(int[] arr, int i, int n){
        if(i == arr.length) return -1;
        if(arr[i] == n) return i;
        return SubSeq(arr, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr = input1D();
        System.out.println(SubSeq(arr, 0, scn.nextInt()));
    }
}
