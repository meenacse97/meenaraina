package guvi;
import java.util.*;
public class starspace {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=n-i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

}

}
