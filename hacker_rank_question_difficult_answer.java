import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void findPivoteIndex(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
           sum += arr[i]; 
        }
        int lf_Sum = 0;
        int idx = 0;
        int flag = 0;
        for(int j = 0; j < arr.length; j++){
            sum -= arr[j];
            if(lf_Sum == sum){
                flag = 1;
                idx = j;  
            }
            lf_Sum += arr[j];
        }
        if(flag == 1){
            System.out.print(idx);
        }
        else{
            System.out.print("-1");
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        findPivoteIndex(arr);
    }
}