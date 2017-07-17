package EF;
import java.util.*;
public class revw {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s1="";
	System.out.println("Enter the string:");
	String s=sc.nextLine();
	String a[]=s.split(" ");
	for(int i=a.length-1;i>=0;i--){
		s1=s1+a[i]+" ";
	}
System.out.println(s1);
		
	}
}


