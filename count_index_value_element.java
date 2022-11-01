import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }
    
    public static int count_even(int[] arr){
        int c = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == i){
                c++;
            }
        }
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input_1(arr);
        count_even(arr);
        
    }
}