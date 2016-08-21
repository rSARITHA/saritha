import java.util.*;
public class StringLower {
public void display()
{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String str1=str.substring(0,1);
	String str2=str.substring(str.length()-1,str.length());
	String str3=str1.toLowerCase();
	String str4=str2.toLowerCase();
	String str5=str.substring(1,str.length()-1);
	System.out.println(str3+str5+str4);
}
public static void main(String[] args) {
	
	System.out.println("Enter the String: ");
	StringLower object=new StringLower();
	object.display();
}
}
