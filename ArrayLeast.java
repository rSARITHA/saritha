import java.util.*;
public class ArrayLeast {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();
		System.out.println("size: "+size);
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-3;i++)
		{
			System.out.println(a[i]);
		}
	}
}
