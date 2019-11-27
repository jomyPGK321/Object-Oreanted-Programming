package Excepion_Hnadling;

public class Arrx_index_Expn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[10]=50;
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
