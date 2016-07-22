import java.util.*;
public class VowelOrConst {

	private static Scanner s;

	public static void main(String[] args[])
	{
		char ch;
		s = new Scanner(System.in);
		ch=s.next().charAt(0);
		switch(ch)
		{
		case 'a':
		{
			System.out.println("'a' IS VOWEL");
			break;
		}case 'e':
		{
			System.out.println("'e' IS VOWEL");
			break;
		}case 'i':
		{
			System.out.println("'i' IS VOWEL");
			break;
		}case 'o':
		{
			System.out.println("'o' IS VOWEL");
			break;
		}case 'u':
		{
			System.out.println("'u' IS VOWEL");
			break;
		}
		default:
			System.out.println("IT NOT A VOWEL");
			break;
			}
		}
	}
