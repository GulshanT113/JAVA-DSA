import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        for(int i = 1; i<=n; i++){
            int num = scn.nextInt();
            if(num % 2 == 0)
            System.out.println(num + " is even");
            else
            System.out.println(num + " is odd");
        }

    }
}