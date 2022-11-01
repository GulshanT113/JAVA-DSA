import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static int binomial(int n, int b){
        int answer;
        for(int i = 0; i < n; i++){
            NCR(n, b);
            power(n, b);
            
            answer = d*ans;
            answer++;
        }
        return answer;
    public static int power(int n, int b){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= b;
        }
        return ans;
    }
    public static int fect(int n){
        int s = 1;
        while(n>0){
            s *= n --;     
        }
        return s;
        
    }
    public static int NCR(int n, int b){
        int a = fect(n);
        int b = fect(n-b);
        int c = fect(b);
        int d = a/(b*c);
        return d;
    }
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int b = scn.nextInt();
        //int r = scn.nextInt();
        System.out.println(answer);
        System.out.println(binomial(n, b));
    }
}




  