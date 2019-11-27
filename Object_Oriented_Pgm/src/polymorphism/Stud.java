package polymorphism;

import java.util.Scanner;

public class Stud {

	public void add(String name, String roll, String dpmt, String yr) {
		// TODO Auto-generated method stub
		System.out.println("Student Details");
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+roll);
		System.out.println("Department:"+dpmt);
		System.out.println("Year:"+yr);
	}

	
	

	public void add(int m1, int m2, int m3, int m4, int m5, int tot, int avg) {
				System.out.println("Maths :"+m1);
				System.out.println("Physics:"+m2);
				System.out.println("Chemistry:"+m3);
				System.out.println("Language:"+m4);
				System.out.println("computer:"+m5);
				
				System.out.println("Total:"+tot);
				System.out.println("Average:"+avg);
				if(tot>=400 & tot<=500)
				{
					System.out.println("1st Rank");	
				}
				if(tot>=300 & tot<=399)
				{
					System.out.println("2nd Rank");	
				}
				if(tot>=200 & tot<=299)
				{
					System.out.println("Just Pass");	
				}
				if(tot<=199)
				{
					System.out.println("Fail");
				}
				
	}


}

	