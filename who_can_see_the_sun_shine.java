import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[] input_1(){
        int[] arr = new int[scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = input_1();
        int c = 1;
        for(int i = 0; i < 1; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] <= arr[j]){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}