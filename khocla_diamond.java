import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int out_s = n/2;
    int inner_s = -1;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= out_s; j++){
            System.out.print("  ");
        }
        System.out.print("* ");

        for(int k = 1; k <= inner_s; k++){
            System.out.print("  ");
        }
        if(i > 1 && i < n){
            System.out.print("* ");
        }
        if(i <= n/2){
            out_s--;
            inner_s += 2;
        }
        else{
            out_s++;
            inner_s -= 2;
        }
        System.out.println();
    }
}
}