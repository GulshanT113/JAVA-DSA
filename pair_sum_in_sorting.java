import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
    public static int pair_sum(int[] arr, int data){
        int si = 0;
        int ei = arr.length-1; 
        while(si<ei){
            int sum = arr[si]+arr[ei];
            if(sum == data){
                System.out.println(si + ", " + ei); 
                si++;
                ei--;
            }
            else if(sum<data){
                si++;
            }
            else{
                ei--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        int data = scn.nextInt();
        pair_sum(arr, data);
    }
}