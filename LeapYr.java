package Javaprogram;
import java.util.*;
public class LeapYr {

	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if((year%4==0)&&(year%100!=0))
		{
			System.out.println(year+ "is a leap year");
		}
		else if((year%400==0)&&(year%4==0)&&(year%100==0))
		{
			System.out.println(year+ "is a leap year");
		}
		else
		{
			System.out.println(year+ "is not a leap year");
		}

	}

}
