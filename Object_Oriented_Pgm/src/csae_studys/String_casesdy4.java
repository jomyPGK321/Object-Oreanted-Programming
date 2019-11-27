package csae_studys;

import java.util.Arrays;
import java.util.Scanner;

public class String_casesdy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the gust's name");
		String gt=s.next();
		System.out.println("Enter the name of the residence host");
		String re=s.next();
		String res=gt.concat(re);
		char ch[]=res.toCharArray();
		Arrays.sort(ch);
		System.out.println("Enter the letters in a pile");
		String pl=s.next();
		char c[]=pl.toCharArray();
		Arrays.sort(c);
		String a=new String(ch);
		String b=new String(c);
		
		if(a.equals(b))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
