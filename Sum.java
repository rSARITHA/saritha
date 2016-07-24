package Javaprogram;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String a=String.valueOf(num);
		StringBuffer str2=new StringBuffer(a);
		str2=str2.reverse();
		System.out.println(str2);
		
	}

}
