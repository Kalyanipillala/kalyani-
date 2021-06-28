import java.util.*;
public class NevOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ev=0,od=0;
while(n>0)
{
int a=n%10;
if(a%2==0)
ev=ev+1;
else
od=od+1;
n=n/10;
}
System.out.println("number of even digits:"+ev);
System.out.println("number of odd digits:"+od);
}}
