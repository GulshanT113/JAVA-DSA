import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the range = ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int ans = find_element(arr, scn.nextInt());
        System.out.println(ans);
    }   
    
    public static int find_element(int[] arr, int m){
        //System.out.println("enter the element would you like to find = ");
       
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
            if(arr[i]==m)
            return i;
        }
        return -1;
    }

}