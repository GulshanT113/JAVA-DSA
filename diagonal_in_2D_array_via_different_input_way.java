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
    public static void diagonal() {
        int[][] arr = input_1();
        System.out.println("diagonal numbers --->");
        int i = 0, j = 0;
        while(i < arr.length && j < arr[i].length){
            System.out.print(arr[i][j] + " ");
            i++;
            j++;
        }
    }
    public static void main(String[] args){
        diagonal();
    }
}