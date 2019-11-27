package encapsulation;
import java.util.Scanner;
public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		reg1 c=new reg1();
		reg2 st=new reg2();
		System.out.println("Registration:");
		do
		{
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
		if(c.getName()==null)
		{
			System.out.println("invalid Name");
		}
		if(c.getAddress()==null)
		{
			System.out.println("invalid Address");
		}
		if(c.getContactNumber()==null)
		{
			System.out.println("invalid Contact Number");
		}
		if(c.getEmail()==null)
		{
			System.out.println("invalid E-mail");
		}
		if(c.getProofType()==null)
		{
			System.out.println("invalid Proof Type");
		}
		if(c.getProofID()==null)
		{
			System.out.println("invalid Proof ID");
		}
		else
		{
			System.out.println("Your Registration is Succesfull ");
		}
		}while(c.getName()==null || c.getAddress()==null || c.getContactNumber()==null || c.getEmail()==null || c.getProofType()==null || c.getProofID()==null);
		
		st.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
	}

}
