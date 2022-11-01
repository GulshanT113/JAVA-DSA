import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input_1(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    public static void lucky_pair(int[] arr){
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i < j){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args){
        int[] arr = input_1();
        lucky_pair(arr);
    }
}
