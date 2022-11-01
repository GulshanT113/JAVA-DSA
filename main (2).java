import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        int n = scn.nextInt();
        for(int i = 1; i<=n; i++){
            //int num = scn.nextInt();
            if(i % 2 == 0)
            System.out.println(i + " is even");
            
            if(i % 2 == 1)
            System.out.println(i + " is odd ");
            
        }

    }
}