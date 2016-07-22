# saritha
package Javaprogram;
import java.util.*;
public class PosOrNeg {
	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num>0)
		{
			System.out.println("Number is Positive:"+num);
		}
		else if(num<0)
		{
			System.out.println("Number is Negative:"+num);
		}
		else
		{
			System.out.println("0");
		}
			
	}

}
