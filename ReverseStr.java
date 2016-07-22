package Javaprogram;
import java.util.*;
public class ReverseStr {

	public static void main(String[] args) {
		String str1="";
		Scanner s=new Scanner(System.in);
		str1=s.next();
		StringBuffer sb=new StringBuffer(str1);
		StringBuffer str2=sb.reverse();
		System.out.println("Reverse String is: "+str2);
}

}
