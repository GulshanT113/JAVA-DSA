import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    
    public static int[] check_mountain(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i])
            System.out.println("this is the peak point of mountain = " + arr[i-1]);
        }
        return arr;
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        check_mountain(arr);
    }
}