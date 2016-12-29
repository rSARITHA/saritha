package Guvi;
import java.util.Arrays;
public class RegNoRepet {
	public static void main(String[] args) {
		int arr[]={102,103,104,102,105,104};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				System.out.println(arr[i]);
			}
			}
		}
	}

