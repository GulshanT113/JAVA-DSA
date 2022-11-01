import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        int n = scn.nextInt();
        boolean flag = true;
        for(int i = 2; i<n/2; i++){
            //int num = scn.nextInt();
            if(n % i == 0){
                flag = false;
                break;
            }
            
        }
        if(flag)
        System.out.println(n + " is a prime number");
        
        else
        System.out.println(n+ " is not a prime number");

    }
}