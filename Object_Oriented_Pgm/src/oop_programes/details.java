package oop_programes;
import java.util.Scanner;
public class details {
	
String name;
String age;
int b,m1,m2,m3,m4,m5,tot,avg;
Scanner s=new Scanner(System.in);
	public void getdetail() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Name");
		name=s.next();
		System.out.println("Enter your Age");
		age=s.nextLine();
		
		b=s.nextInt();
		System.out.println("Enter The Mark");
		 m1=s.nextInt();
		 m2=s.nextInt();
		 m3=s.nextInt();
		 m4=s.nextInt();
		 m5=s.nextInt();
		tot=m1+m2+m3+m4+m5;
		 avg=tot/5;
		
	}

	public void disply() {
		// TODO Auto-generated method stub
		System.out.println("Details");
		System.out.println("Mark ="+tot);
		System.out.println("Avg ="+avg);

	}
	

}
