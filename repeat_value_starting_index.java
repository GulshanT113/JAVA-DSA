import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i= 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    public static int copy_ele_length(int[] arr){
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i]==arr[i+1])
            return i;
        }
        return i;
    }
    public static void main(String[] args) {
        int n = scn.nextInt(); 
        int[] arr = new int[n];
        input_1(arr);
        System.out.print(copy_ele_length(arr));
    }    
}