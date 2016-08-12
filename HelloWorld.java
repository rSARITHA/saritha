package guvi;

public class HelloWorld {

	public static void main(String[] args) {

		char a;
		String str1="Helloworld";
		int num=2;
		String str2=str1.substring(0, 2);
		String str3="";
		
		for(int i=3;i<str1.length();i=i+2)
		{
			a=str1.charAt(i);
			str3+=a;
		}
		System.out.println(str2+str3);
	}
}
