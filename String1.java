public class String1 {
	public void reverse(String str) {
		StringBuffer str2=new StringBuffer(str);
	    if(str.length()<=1) 
	    {
	    	System.out.println( str);
	    }
	    	else
	    	{
	    		str2=str2.reverse();
	    		System.out.println(str2);
	    	}
	    }
	public static void main(String[] args) {
		String1 s=new String1();
		s.reverse("saritha");
		}
}
