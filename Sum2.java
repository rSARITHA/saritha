import java.util.*;
public class Sum2 {
	public static void main(String[] args) {
		int k=0;
		int sum=0;
		for(int i=1;i<=15;i++)
		{
			k=k+i;
		}
		for(int i=15;i<=45;i++)
		{
			if(!(i%2==0))
			{
				sum=sum+i;
			}
		}
		System.out.println(k);
		System.out.println(sum);
	}
}
