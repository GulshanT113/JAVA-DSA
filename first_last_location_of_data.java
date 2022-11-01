import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void first_last(int[] arr, int data){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == data){
                System.out.println(i);
                break;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(arr[i] == data){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        first_last(arr, scn.nextInt());
    }
}