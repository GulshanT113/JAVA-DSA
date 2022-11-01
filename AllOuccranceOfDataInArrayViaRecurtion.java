import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input1D(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
        return arr;
    } 
    public static void SubSeq(int[] arr, int i, int n){
        if(i == arr.length) return;
        if(arr[i] == n) System.out.print(i + " ");
        SubSeq(arr, i+1, n);
    }
    public static void main(String[] args) {
        int[] arr = input1D();
        SubSeq(arr, 0, scn.nextInt());
    }
}
