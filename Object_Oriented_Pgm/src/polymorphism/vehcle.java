package polymorphism;
import java.util.Scanner;

public class vehcle {
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("1)Bike");
System.out.println("2)Car");
int n=s.nextInt();
vehcle1 v=new vehcle1();
switch(n)
{
case 1:
System.out.println("Enter the details of Bike");
System.out.println("Enter the color");
String c=s.next();
System.out.println("Enter the maximum speed");
int sp=s.nextInt();
System.out.println("Enter the no. of seats");
int st=s.nextInt();
System.out.println("Enter the no.of wheels");
int w=s.nextInt();
System.out.println("Enter the status of disk brake(true/false)");
String d=s.next();
v.details(c,sp,st,w,d);
break;
case 2:
    System.out.println("Enter the details of Car");
System.out.println("Enter the color");
String c1=s.next();
System.out.println("Enter the maximum speed");
int sp1=s.nextInt();
System.out.println("Enter the no. of seats");
int st1=s.nextInt();
System.out.println("Enter the no.of wheels");
int w1=s.nextInt();
System.out.println("Enter the no.of door");
int dr=s.nextInt();
System.out.println("Enter the status of AC(true/false)");
String a=s.next();
v.details(c1,sp1,st1,w1,dr,a);
break;
default:
	System.out.println("Invalid Option");

}
}
}

