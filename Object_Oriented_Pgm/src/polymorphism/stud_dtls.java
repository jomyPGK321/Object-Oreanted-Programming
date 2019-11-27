package polymorphism;
import java.util.Scanner;
public class stud_dtls {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stud a=new Stud();
		System.out.println("Enter the Name:");
		String name=s.next();
		System.out.println("Enter the Roll No.:");
		String roll=s.next();
		System.out.println("Enter the Department:");
		String dpmt=s.next();
		System.out.println("Enter the Year:");
		String yr=s.next();
		System.out.println("Enter the mark1.:");
		int m1=s.nextInt();
		System.out.println("Enter the mark2.:");
		int m2=s.nextInt();
		System.out.println("Enter the mark3.:");
		int m3=s.nextInt();
		System.out.println("Enter the mark4.:");
		int m4=s.nextInt();
		System.out.println("Enter the mark5.:");
		int m5=s.nextInt();
		int tot,avg;
		tot=(m1+m2+m3+m4+m5);
		avg=tot/5;
		
        a.add(name,roll,dpmt,yr);
        a.add(m1,m2,m3,m4,m5,tot,avg);
      
        
        
	}

}
