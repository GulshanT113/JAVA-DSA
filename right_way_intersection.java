import java.util.*;
public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input_1(int[] arr){
        for(int i = 0; i < arr.length; i++)
        arr[i] = scn.nextInt();
    }
    public static void main(String args[]) {
        int n = scn.nextInt();
        int myArray1[] = new int[n];
        input_1(myArray1);
        int m = scn.nextInt();
        int myArray2[] = new int[m];
        input_1(myArray2);
        for(int i = 0; i<myArray1.length; i++ ) {
            for(int j = 0; j<myArray2.length; j++) {
                if(myArray1[i]==myArray2[j]) {
                    System.out.print(myArray1[i] + " ");
                }
            }
        }
    }
}