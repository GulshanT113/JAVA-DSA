import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static boolean palin_drome(int[] arr) {
        int i = 0; int j = arr.length-1;
        while(i < j){
            if(arr[i] != arr[j])
            return false;
            
            i++;
            j--;
        }
        return true;
        
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        System.out.println(palin_drome(arr));
    }
}
