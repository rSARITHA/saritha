import java.util.*;
public class NumberMul {
	static int sum=1;
	public void number(int num)
	{
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			sum*=a;
		}
		System.out.println(sum);
	}
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int num=s.nextInt();
	    NumberMul n=new NumberMul();
	    n.number(num);
	    System.out.println(num*sum);
  
}
}
