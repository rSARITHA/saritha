package Javaprogram;
import java.util.*;
public class ReverseDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rev=0;
		while(num!=0)
		{
			rev=rev*10;
			int a=num%10;
			rev=rev+a;
			num=num/10;
		}
		System.out.println("Reverse Digit is:"+rev);
		}

}
