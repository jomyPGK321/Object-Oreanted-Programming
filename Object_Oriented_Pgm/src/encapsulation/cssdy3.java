package encapsulation;

import java.util.Scanner; 
public class cssdy3 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		int person, i = 1, n = 1;
		cssdy4 t = new cssdy4();
		cssdy5 c=new cssdy5();

		System.out.println("Enter price of ticket");
		t.setPrice(st.nextInt());
		System.out.println("Enter no of person");
		t.setPer(st.nextInt());
		person = t.getPer();
		do {
			System.out.printf("Enter Details Of Person %d\n", i);
			i++;
			System.out.println("Enter name");
			t.setName(st.next());
			System.out.println("Enter gender(F/M)");
			t.setG(st.next());
			System.out.println("Enter age");
			t.setAge(st.nextInt());
			person--;
		} while (person > 0);
		t.ticket(t.getPer(), t.getPrice());
		while (n <= t.getPer()) {
			double total = t.cssdy5(t.getAge(), t.getG(), t.getPer(), t.getPrice());
			if (n == t.getPer()) {
				System.out.printf("Total Amount=%.1f", total);
				break;
			}
			n++;
		}
	}
}
