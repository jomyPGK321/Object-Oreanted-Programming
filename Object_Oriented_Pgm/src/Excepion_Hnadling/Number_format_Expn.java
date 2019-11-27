package Excepion_Hnadling;

public class Number_format_Expn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s="abc";
			int i=Integer.parseInt(s);
			System.out.println(s);
		}
		catch(NumberFormatException e)
		{
		System.out.println(e);
	}}

}
