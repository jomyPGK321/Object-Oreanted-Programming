package Regex_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_maches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile(".@");
		Matcher m=p.matcher("p@");
		boolean b=m.matches();
		System.out.println(b);
	}

}
