package Regex_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String regexregno ="[0-9]*";
		Pattern regno=Pattern.compile(regexregno);
 System .out.println("enter the reg no");
		String regno1=s.next();
		 Matcher re=regno.matcher(regno1);
 if(re.matches())
		 {
			 System .out.println("Valid Reg no");
		 }
		 else
		 {
			 System .out.println("invalid reg no");
		 }
	}

}
