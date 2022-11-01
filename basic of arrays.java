import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
            System.out.println(arr[i]);
        }
        //System.out.println();
    }
}
