package guvi;

public class Program {

	public static void main(String[] args) {
		String str1="Programming";
		String str2=str1.substring(0,1);
		char a;
		String str3="";
		for(int i=1;i<str1.length();i++)
		{
			a=str1.charAt(i);
			str3+=str2+a;
		}
		System.out.println(str3);
		

	}

}
