import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input_1(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void print_1(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] add(int[][] a, int[][] b){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] += b[i][j];
            }
        }
        return a;
    } 
    public static void addition_of_2_arrays() {
        int[][] a = input_1();
        int[][] b = input_1();
        add(a, b);
        print_1(a);
    }
    public static void main(String[] args){
        addition_of_2_arrays();
    }
}