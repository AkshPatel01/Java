import java.util.*;
public class Practical2
{
public static void main (String[] args)
{
Scanner sn = new Scanner(System.in);
int limit = 0, count = 0;
System.out.print("Enter The Limit Of Prime Numbers To Be Printed: ");
limit = sn.nextInt();
for(int i=1; count<limit; i++)
{
if(check_prime(i) == true)
{
System.out.println(i);
count++;
}
}
}
public static boolean check_prime(int num)
{
for(int i=2; i<num;i++)
{
if(num%i == 0)
{
return false;
}
}
return true;
}
}