package Excepion_Hnadling;

public class Arithmetc_Expn {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int a;
		try {
			a=50/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
