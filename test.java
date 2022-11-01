//import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    
    public static int multiple_1(int n){
        int a;
        
        for(int i = 1; i <=n ; i++)
        {
            if(i % 2 != 0){
                a = i*3;
                System.out.print(a + " ");
                if(n <= a)
                break;
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        
        multiple_1(n);
    }
}
