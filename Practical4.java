import java.util.*;
class Practical4
{
public static void main(String args[]){
Scanner sn = new Scanner(System.in);
double a, b, c;
System.out.print("Enter Number in A: ");
a = sn.nextDouble();
System.out.print("Enter Number in B: ");
b = sn.nextDouble();
System.out.print("Enter Number in C: ");
c = sn.nextDouble();
if((a>b)&&(a>c))
{
if(b>c)
{
System.out.println("B is Second Largest");
}
else
{
System.out.println("C is Second Largest");
}
}
else if((b>c)&&(b>a))
{
if(a>c)
{
System.out.println("A is Second Largest");
}
else
{
System.out.println("C is Second Largest");
}
}
else if((c>a)&&(c>b))
{
    if(a>b)
    {
    System.out.println("A is Second Largest");
    }
    else
    {
    System.out.println("B is Second Largest");
    }
    }
    else
    {
    System.out.println("all are equal");
    }
    }
    }
    