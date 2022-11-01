import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static void print_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");        
        }
        System.out.println();
    }
    public static int sum_of_array(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            System.out.print(sum + " ");
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr); 
        sum_of_array(arr);
    }
}