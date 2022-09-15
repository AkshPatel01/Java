import java.util.*;
public class Practical3
{
public static void main (String[] args)
{
Scanner sn = new Scanner(System.in);
double a=0, b=0, c=0;
System.out.print("Enter Integer in A:");
a = sn.nextDouble();
System.out.print("Enter Integer in B:");
b = sn.nextDouble();
System.out.print("Enter Integer in C:");
c = sn.nextDouble();
if(a == b && b == c && c == a){
System.out.println("A, B and C are same!");
}
else if(a == b && a > c){
System.out.println("A, B are same and maximum!");
}
else if(a == b && a < c){
System.out.println(a>b?(a>c?"A: "+a:"C: "+c):b>c?"B:"+b:"C: "+c);
}
else if(b == c && b > a){
System.out.println("B, C are same and maximum!");
}
else if(b == c && b < a){
System.out.println(a>b?(a>c?"A: "+a:"C: "+c):b>c?"B:"+b:"C: "+c);
}
else if(c == a && c > b){
	System.out.println("A, C are same and maximum!");
	}
	else if(c == a && c < b){
	System.out.println(a>b?(a>c?"A: "+a:"C: "+c):b>c?"B:"+b:"C: "+c);
	}
	else{
	System.out.println(a>b?(a>c?"A: "+a:"C: "+c):b>c?"B:"+b:"C: "+c);
	}
	}
	}