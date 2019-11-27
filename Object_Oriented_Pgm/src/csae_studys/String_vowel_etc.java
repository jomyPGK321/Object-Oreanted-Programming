package csae_studys;

import java.util.Scanner;

public class String_vowel_etc {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String a= s.next();
	String b=s.next();
	String c=s.next();
	int i;
	char ch1[]=a.toCharArray();
	char ch2[]=b.toCharArray();
	char ch3[]=c.toCharArray();
	for(i=0;i<a.length();i++)
	{
		if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u')
		{
		ch1[i]='$';	
		}
	}	     
		for(i=0;i<b.length();i++)
		{
			if(ch2[i]=='a'||ch2[i]=='e'||ch2[i]=='i'||ch2[i]=='o'||ch2[i]=='u')
			{
			ch2[i]=ch2[i];	
			}
			else
			{
				ch2[i]='#';
			}
		}
		for(i=0;i<c.length();i++)
		{
			if(ch3[i]>=97&&ch3[i]<=122)
			{
				ch3[i]=(char)(ch3[i]-32);
			}
		}
		String a1=String.copyValueOf(ch1);
		String b2=String.copyValueOf(ch2);
		String c3=String.copyValueOf(ch3);
		System.out.println(a1+b2+c3);
		
	
	
}
}