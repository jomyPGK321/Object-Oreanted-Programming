package Abstraction;
import java.util.Scanner;
public class abs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			System.out.println("Physics ");
			int n1=sc.nextInt();
			System.out.println("Chemistry");
			int n2=sc.nextInt();
			System.out.println("maths");
			int n3=sc.nextInt();
			System.out.println("English");
			int n4=sc.nextInt();
			System.out.println("Language");
			int n5=sc.nextInt();
			Student s= new Student();
			s.totalmark(name,id,n1,n2,n3,n4,n5);
		}

	}
}
	abstract class rank{
		abstract void totalmark(String name,int id,int n1,int n2,int n3,int n4,int n5);
		
		public void rank1() {
			
			System.out.println("Rank 2");
		}
	}
	class Student extends rank{
		void totalmark(String name,int id,int n1,int n2,int n3,int n4,int n5) {
			int tot=n1+n2+n3+n4+n5;
			int avg=tot/5;
			System.out.println("Nmae:"+name);
			System.out.println("ID:"+id);
			System.out.println("Subject 1:"+n1);
			System.out.println("Subject 2:"+n2);
			System.out.println("Subject 3:"+n3);
			System.out.println("Subject 4:"+n4);
			System.out.println("Subject 5:"+n5);
			System.out.println("Total:"+tot);
			System.out.println("Average:"+avg);
			
			super.rank1();
	}
	}

