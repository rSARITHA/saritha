package Javaprogram;
import java.util.*;
public class LargestNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println(a+" is largest number");
		}
		else if(b>c)
		{
			System.out.println(b+" is largest number ");
		}else
		{
			System.out.println(c+" is largest number");
		}

	}

}
