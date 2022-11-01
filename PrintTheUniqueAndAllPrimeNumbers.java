import java.util.*;
public class Main{
    public static boolean IsPrime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
            c++;
        }
        if(c == 2)
        return true;
        else
        return false;
    }
    public static void print1D(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int c = 0;
        int[] ans = new int[25];
        int i = 0;
        while(i < ans.length){
            for(int j = 100; j >=1; j--){
                if(IsPrime(j))
                ans[i++] = j;
            }
        }    
        System.out.println(ans[1]);
        print1D(ans);
    }
}
