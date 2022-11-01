import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    
    public static int[] peak_mountain(int[] arr){
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        peak_mountain(arr); 
    }
}