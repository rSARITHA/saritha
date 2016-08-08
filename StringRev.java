
public class StringRev {

	public static void main(String[] args) {
		String str1="Welcome To Guvi";
		StringBuffer sb=new StringBuffer(str1);
		sb=sb.reverse();
		String str3=new String(sb);
		for(int i=0;i<str3.length();i++)
		{
			char c=str3.charAt(i);
			if(Character.isLowerCase(c))
			{
				c=Character.toUpperCase(c);
			}
			else
			{
				c=Character.toLowerCase(c);
			}
			System.out.print(c);

	}
		
	}
}
