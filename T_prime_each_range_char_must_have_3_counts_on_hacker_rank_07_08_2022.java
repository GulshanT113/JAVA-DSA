import java.util.*;
public class Solution {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1D(int arr[]){
        for(int i=0;i<arr.length;i++)
            arr[i]=scn.nextInt();
    }   
    public static boolean T_prime_check(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                c++;
        }
        if(c == 3)
            return true;
        else 
            return false;
    }
    public static void T_prime(int n){
        int arr[] = new int[n];
        input_1D(arr);
        for(int i : arr){
            if(T_prime_check(i))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }    
    }
    public static void main(String[] args) {
        T_prime(scn.nextInt());
    }
}