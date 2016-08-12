package guvi;

public class CountCharacter {

	public static void main(String[] args) {
		int c=0;
		String str1="saritha";
		char a[]=new char[str1.length()];
		for(int i=0;i<str1.length();i++)
		{
			a[i]=str1.charAt(i);
			c++;
		}
		System.out.println(c);
		}

	
}


