import java.util.*;
public class Main
{
    public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		int rows = scn.nextInt();
		
		for (int i = 1; i <= rows; i++)
		{
		for (int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
		for (int j = i; j <= rows; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
	}
}
