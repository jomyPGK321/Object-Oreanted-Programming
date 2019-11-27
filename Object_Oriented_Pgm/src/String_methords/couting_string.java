package String_methords;

import java.util.Scanner;

public class couting_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String c=s.nextLine();
		System.out.println(c.length());
		//for(int i=0;i<c;i++)
		int i=0;
		
		char a=c.charAt(i);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.println(c.length());
		}
		
	}

}
