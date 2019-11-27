package encapsulation;
import java.util.Scanner;
public class stud_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student c=new Student();
		System.out.println("Enter The Name");
		c.setName(s.next());
		System.out.println("Enter The ID");
		c.setID(s.nextInt());
		System.out.println("Name"+c.getName());
		System.out.println("ID"+c.getID());
		
		
	}
}