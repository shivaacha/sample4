import java.lang.*;
import java.util.Scanner*;
class sum { 
public static void main(String args[])
{
int a, b, sum;
System.out.println("enter two numbers:");
Scanner in = new Scanner(System.in);
  a= in.nextInt();
  b= in.nextInt();
sum=a+b;
System.out.println("sum of two numbers is"+sum);
}
}
