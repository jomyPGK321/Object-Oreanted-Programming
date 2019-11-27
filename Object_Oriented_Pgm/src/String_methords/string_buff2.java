package String_methords;

import java.util.Scanner;

public class string_buff2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		System.out.println("Enter the Name");
		s.append("Name :"+sc.next()+"\n");
		System.out.println("Enter the ID");
		s.append("ID :"+sc.next()+"\n");
		System.out.println("Enter the Age");
		s.append("Age :"+sc.next()+"\n");
		System.out.println("Enter the Salary");
		s.append("Salary :"+sc.next()+"\n");
		System.out.println(s);
	}

}
