package Regex_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		 Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter The User Name");
		String name=s.next();
		Matcher em=pattern.matcher(name);
		System.out.println("Enter The Password");
		String pswd=s.next();
		Matcher mtch=pattern.matcher(pswd);
		if(em.matches())
		{
			System.out.println("Valid E-Mail ID");
		}
		else
		{
			System.out.println("Invalid E-Mail ID!!!");
		}
		if(mtch.matches())
		{
			System.out.println("Valid Password");
		}
			else
			{
				System.out.println("Invalid Password!!!");
			}
		}
	}


