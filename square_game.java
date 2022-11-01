import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static void square_game(){
        int c = scn.nextInt();
        int a = 0;
        for(int x = 1; x < c/2; x++){
            for(int y = 2; y <= c/2; y++){
                if((x*x)+(y*y) == c){
                    a++;
                    break;
                }
            }
        }
        if(a != 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args){
        square_game();
    }
}