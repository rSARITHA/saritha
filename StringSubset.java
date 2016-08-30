import java.util.*;
public class StringSubset {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("str1:");
		String str1=s.next();
		System.out.println("str2:");
		String str2=s.next();
		if(str2.contains(str1))
		{
			System.out.println("str2 is a substrng of str1");
		}
		else
		{
			System.out.println("str2 is not substrng of str1");
		}
	}

}
