import java.util.Scanner;
public class Main
{
    public static Scanner sc=new Scanner(System.in);
    public static int find(String s,char ch)
    {
        String ans="";
        int c=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==ch)
            {
                c++;
                ans=ans+""+ch;
            }
        }
        System.out.println(ans);
        return c;
    }
    //AABBCC
    //2
    //-->>AA,BB,CC
    public static void main(String[] args)
    {
        String s;
        System.out.println("Enter a string");//User please enter  a string
        s=sc.nextLine();
        System.out.println("Enter a charcter to count");
        char ch=sc.next().charAt(0);//Count this character
        String str=s.toUpperCase();///Converting string to upper case
        
        if(Character.isLowerCase(ch))///If lowercase Input Convert to Uppercase
        {
           ch=Character.toUpperCase(ch);
        }
        System.out.println(find(str,ch));
    }
}
