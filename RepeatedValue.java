import java.util.*;
public class RepeatedValue {
		public static void main(String[] args) {
			    int count=0;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the size of an array :");
				int a=s.nextInt();
				int[] b=new int[a];
				System.out.println("Enter the Array elements :");
				for(int i=0;i<b.length;i++)
				{
					
					b[i]=s.nextInt();
				}
				for(int i=0;i<b.length;i++)
				{
					if(b[0]==b[i])
					{
						count++;
					}
				}
				System.out.println("Repeated Elements : "+b[0]);      
				System.out.println("Number of times the Element is Repeated  : "+count);
			}
}
