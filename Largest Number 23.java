import java.util.*;
public class Main{
    public static Scanner input=new Scanner(System.in);
    public static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static String largestNumber(List<Integer> arr) {
        String[] strArr=new String[arr.size()];
        StringBuilder sb =new StringBuilder();
        for(int i = 0; i < arr.size(); i++)
            strArr[i] = String.valueOf(arr.get(i));
        for(int i = 0; i < strArr.length-1; i++){
            for(int j = i+1; j < strArr.length; j++){
                if((strArr[i] + strArr[j]).compareTo((strArr[j] + strArr[i])) < 0) swap(strArr, i, j);
            }
        }
        for(int i = 0; i < strArr.length; i++){
            if(Integer.parseInt(strArr[i]) == 0 && sb.length() == 0)
                continue;
            sb.append(strArr[i]);
        }            
        return sb.length() == 0 ? "0" : sb.toString();
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        while (input.hasNextInt()) 
            arr.add(input.nextInt());
        System.out.println(largestNumber(arr));
    }
}
