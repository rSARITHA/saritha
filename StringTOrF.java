import java.util.*;
public class StringTOrF {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
	    char c[]=str.toCharArray();
	   char c1=0;
		for(int i=0;i<c.length;i++)
		{
			 c1=c[i];
			 //System.out.println(c1);
		}
		if((c1>=65&&c1<=90)||(c1>=97&&c1<=122))
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
	}
	}
		
	
