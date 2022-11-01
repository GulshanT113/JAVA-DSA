import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static String countOccurence(String str){
        String newstr = "";
        for(int i = 0; i < str.length(); i++){
            if(newstr.indexOf(str.charAt(i)) == -1)
            newstr += str.charAt(i);
        } 
        return newstr;
    }
    public static void main(String[] args){
        System.out.println(countOccurence(scn.nextLine()));
    }
}