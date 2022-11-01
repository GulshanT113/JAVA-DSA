import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void print_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
    public static void zeros_on_R_H_S(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int[] b = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i] != 0){
                b[s] = arr[i];
                s++;
            }
            else{
                b[e] = arr[i];
                e--;
            }
        }
        print_1(b);
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int arr[] = new int[n];
        input_1(arr);
        zeros_on_R_H_S(arr);
    }
}  
    
    
    
