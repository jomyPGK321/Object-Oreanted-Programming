package Inheritence;
import java.util.Scanner;
public class multi_inhtns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the ID");
		int id=s.nextInt();
		
		System.out.println("Enter the Total");
		int tot=s.nextInt();
		
		 Student sc = new Student();
	        sc.detail(name, id);
	        sc.total(tot);
	}

}
interface rank{
    public  void detail(String name, int id);
}
interface total{
    public  void total(int tot);
}
class Student implements rank,total{
    public void detail(String name, int id)
    {
        System.out.println("Name ->"+name);
        System.out.println("Student ID ->"+id);
    }    
    public void total(int t) {
        System.out.println("Total ->"+t);
        
    }
}