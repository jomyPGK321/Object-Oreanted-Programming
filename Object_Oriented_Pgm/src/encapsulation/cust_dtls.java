package encapsulation;
import java.util.Scanner;
public class cust_dtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		cust1 c=new cust1();
		cust2 st=new cust2();

		System.out.println("Enter The Name");
		c.setName(s.next());
		System.out.println("Enter The Address");
		c.setAddress(s.next());
		System.out.println("Enter The Contact Number");
		c.setContactNumber(s.next());
		System.out.println("Enter The E-mail");
		c.setEmail(s.next());
		System.out.println("Enter The Proof Type");
		c.setProofType(s.next());
		System.out.println("Enter The Proof ID");
		c.setProofID(s.next());
		st.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
	}
}