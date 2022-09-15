import java.util.*;
public class Practical5{
public static void main(String[] args){
int[] array;
int cnt = 4, i = 0;
array = new int[100];
String inp;
Scanner sn = new Scanner(System.in);
System.out.println("Notice: Enter 'end' when you wanted to end!");
while(i < 20){
System.out.print("Enter Value In [");
System.out.print(i+1);
System.out.println("]: ");
inp = sn.next();
if(inp.equals("end")){
break;
}
try{
array[i] = Integer.valueOf(inp);
i = i + 1;
}
catch(Exception e){
System.out.println("Invalid Input!, The Array is Ended!");
break;
}
}
i = i - 1;
System.out.println("Printing Reverse Of That Array:");
while(i >= 0){
System.out.println(array[i]);
i = i - 1;
}
}
}