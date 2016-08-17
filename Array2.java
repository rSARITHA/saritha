import java.util.*;
public class Array2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]={1,2,3,4,5,6,7,8,9};
		int b[]={a[2],a[1],a[0],a[5],a[4],a[3],a[8],a[7]};
		System.out.print("[");
		for(int i=0;i<b.length;i++)
		{
		System.out.print(b[i]+",");
		}
		System.out.print(a[6]);
		System.out.print("]");
}
}
