package String_methords;

import java.util.Scanner;

public class First_methord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String a="jomy george";//first string value	
		String b=s.next();//second string value
		System.out.println("Length :"+a.length());//printing the length of first sting
		System.out.println("Charector :"+a.charAt(3));//printing the character of first sting
		System.out.println("Sub String :"+a.substring(2,9));//printing the sub string of first string
		System.out.println("Starts :"+a.startsWith("jomy"));//printing the starting valve of first string
		System.out.println("Index is :"+a.indexOf("3"));//printing the index of first string
		System.out.println(a.concat(b));//printing the concat of second string
		System.out.println("Repalced :"+b.replace("g","G"));//replaced the second string character
		String word[]=b.split("");//create an array for split
		for(String ar:word)
		{
			System.out.println(ar);
		}
		System.out.println("Equal :"+a.contentEquals(b));
	}

}
