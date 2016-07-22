package Javaprogram;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is Even Number");
		}
		else
		{
			System.out.println(num+" is odd Number");
		}


	}

}
