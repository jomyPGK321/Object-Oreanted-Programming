package Regex_Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern name = Pattern.compile("[a-zA-Z]*");
		Pattern reg = Pattern.compile("[0-9]*$");
		Pattern rank = Pattern.compile("[0-9]*$");
		Pattern password = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		Pattern yr = Pattern.compile("^\\d{4}$");
		Pattern dep = Pattern.compile("^[A-Z][.][a-z]*");
		Pattern pat = Pattern.compile(regex);
		System.out.println("Enter The User Name");
		String nme = s.next();
		Matcher nam = name.matcher(nme);
		if (nam.matches()) {
			System.out.println("Valid Name");
		} else {
			System.out.println("Invalid Name!!!");
		}
		System.out.println("Enter The E-Mail");
		String eml = s.next();
		Matcher em = pat.matcher(eml);
		if (em.matches()) {
			System.out.println("Valid E-Mail ID");
		} else {
			System.out.println("Invalid E-Mail ID!!!");
		}
		System.out.println("Enter The Register Number");
		String regno = s.next();
		Matcher rn = reg.matcher(regno);
		if (rn.matches()) {
			System.out.println("Valid Register Number");
		} else {
			System.out.println("Invalid Register Number!!!");
		}
		System.out.println("Enter The Rank");
		String rk = s.next();
		Matcher rnk = rank.matcher(rk);
		if (rnk.matches()) {
			System.out.println("Valid Rank");
		} else {
			System.out.println("Invalid Rank!!!");
		}
		System.out.println("Enter The Year");
		String yer = s.next();
		Matcher y = yr.matcher(yer);
		if (y.matches()) {
			System.out.println("Valid Year");
		} else {
			System.out.println("Invalid Year!!!");
		}
		System.out.println("Enter The Department");
		String dept = s.next();
		Matcher dm = dep.matcher(dept);
		if (dm.matches()) {
			System.out.println("Valid Department");
		} else {
			System.out.println("Invalid Department!!!");
		}
		if (nam.matches() && em.matches() && rn.matches() && rnk.matches() && y.matches() && dm.matches()) {
			System.out.println("Login Page");
			System.out.println("Enter User Name");
			String emls = s.next();
		if (eml.equals(emls)) {
				System.out.println("Enter Password");			
			}
			else {
				System.out.println("Invalid User name");
			}
		String pssd = s.next();
		Matcher pd = password.matcher(pssd);
		System.out.println("Your User Name is :"+emls);
		System.out.println("Your password is :"+pssd);
			System.out.println("Your Registration is Successfull");

		}
	}
}
