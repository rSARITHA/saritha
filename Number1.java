import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int len=String.valueOf(num).length();
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			sum+=(int)Math.pow(a, len);
			num=num/10;
		}
       System.out.println(sum);
	}

}
