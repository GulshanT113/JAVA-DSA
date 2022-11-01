import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
    
    public static void alternate(int[] arr){
        reverse(arr);
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0)
                System.out.println(arr[i]);       
        }
    }
    
    public static int reverse(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        alternate(arr);
        
    }
}