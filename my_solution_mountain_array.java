import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    
    public static void peak_ele(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[i+1] && arr[i+1] > arr[i+2])
            System.out.println(i+1);
        }
    }
    
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        peak_ele(arr);
    }
}