package encapsulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class amstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a =Integer.parseInt(br.readLine());
		int t=a;
		int f=a;
		int i=0;
		int m=0; 
		double n=0;
		
		while(t!=0)
		{
			i++;
			t=t/10;
			
		}
		t=a;
		while (t!=0)
		{
			m=t%10;
			n= n + Math.pow(m,i);
			t=t/10;
		}
		if (n==f)
		System.out.println("YES");
		else
			System.out.println("NOT");
			

	}

}
