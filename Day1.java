import java.util.Scanner;

public  class Day1 
{
	public void Days(String s)
	{
	    if (s.equalsIgnoreCase("Monday")) {
	        System.out.println( "true");
	    } else if  (s.equalsIgnoreCase("Tuesday")) {
	    	System.out.println( "true");
	    } else if  (s.equalsIgnoreCase("Wednesday")) {
	    	System.out.println( "true");
	    } else if  (s.equalsIgnoreCase("Thrusday")){
	    	System.out.println( "true");
	    } else if (s.equalsIgnoreCase("Friday")) {
	    	System.out.println( "true");
	    }
	    else if(s.equalsIgnoreCase("Saturday"))
	    {
	    	System.out.println( "true");
	    }
	    else
	    	System.out.println( "false");
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Day1 d=new Day1();
		d.Days(s);

	}
	    }


