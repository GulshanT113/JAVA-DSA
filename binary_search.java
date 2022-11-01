import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
    public static int binary_search(int[] arr, int data){
        int si = 0;
        int ei = arr.length-1;
        int mid;
        while(si<=ei){
            mid = (si+ei)/2;
            if(arr[mid] == data){
                return mid; 
            }
            else if(arr[mid]<data){
                si = mid + 1;
            }
            else{
                ei = mid - 1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        int data = scn.nextInt();
        int ans = binary_search(arr, data);
        System.out.println(ans);
    }
}