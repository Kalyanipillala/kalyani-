import java.util.*;
class VoCon
{
public static void main(Sting args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
switch(c)
{
case 'a':
case 'A':
case 'e':
case 'E':
case 'i':
case 'I':
case 'o':
case 'O':
case 'u':
case 'U': System.out.println("given character is vowel");
               break;
default :System.out.println("given character is consonant");
}}}