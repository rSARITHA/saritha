package Javaprogram;
import java.util.*;
public class Alphabet {

	public static void main(String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
		{
			System.out.println("character "+c+ " is Alphabet");
		}
		else
		{
			System.out.println("character "+c+ "is not Alphabet");
		}

	}

}
