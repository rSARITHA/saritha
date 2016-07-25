package Javaprogram;
import java.util.*;
public class CountNoDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println(count);
		}
		}
