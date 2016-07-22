package Javaprogram;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int fact=1,a=1;
	    while(num>=a)
	    {
		  fact*=a;
		  a++;
	    }
		 System.out.println("Factorial Number is:"+fact);
	}
}
