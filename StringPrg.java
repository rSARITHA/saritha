
public class StringPrg {
	public static void main(String[] args) {
		String str1="test123string";
		String str2="123";
		if(str1.contains(str2))
		{
			int len=str1.indexOf(str2);
			System.out.println(len);
		}
		else
		{
			System.out.println(1);
		}

	}

}
