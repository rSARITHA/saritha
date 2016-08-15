import java.util.*;
public class PowOfTwo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if((~num&1)==1)
		{
			System.out.println(num+" is power of two");
		}
		else
		{
			System.out.println(num+" is not a power of two");
		}
	}
	
	

}
