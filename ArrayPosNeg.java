import java.util.*;
public class ArrayPosNeg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size=s.nextInt();
		int sum=0;
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{	
			a[i]=s.nextInt();
		for(int j=1;j<a.length;j++)
		{
				sum=a[i]+a[j];
		}
		}
		if(sum==1||sum==-1||sum==0)
			{
				System.out.println(sum);
			}
			else
			{
				System.out.println(sum);
			}
			
			}
}
