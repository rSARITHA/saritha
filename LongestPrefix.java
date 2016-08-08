import java.util.*;
public class LongestPrefix
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
String length1 = "",check;
if(a.length>0)
length1=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(length1.length(),a[i].length());j++)
{
if(length1.charAt(j)!=check.charAt(j))
break;
}
length1=a[i].substring(0,j);
}
System.out.println("longest prefix is:"+length1);
}
}
