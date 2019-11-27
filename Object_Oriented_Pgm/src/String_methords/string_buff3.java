package String_methords;

public class string_buff3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Hello ");
		System.out.println(s);
		s.append("Hai");
		System.out.println(s);
		s.insert(5," pooi");
		System.out.println(s);
		s.replace(2,4,"Haaaii");
		System.out.println(s);
		s.deleteCharAt(4);
		System.out.println(s);
		s.delete(2, 4);
		System.out.println(s);
	}
}