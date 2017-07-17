package guvi;
import java.util.*;
public class Array1steleRepeat {
	public static void main(String[] args){
		int a[]=new int[5];
		int m=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
		a[i]=s.nextInt();
			}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i!=j){
					if(a[i]==a[j])
				m=1;
				}
			}
			if(m==1){
			System.out.println(a[i]);
				break;
			}	
		}
	}
}
	