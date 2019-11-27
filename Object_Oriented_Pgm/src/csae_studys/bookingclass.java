package csae_studys;
import java.util.*;
public class bookingclass {

	public static int booked[]=new int[25];
		public static void book()
		{
			String ac;
			String cot;
			String cable;
			String wifi;
			String laundry;
			Scanner sc=new Scanner(System.in);
			int total,b=0,c,d,e,f,i=1;
			System.out.println("Booking");
			System.out.println("Please choose the service requerence");
			System.out.println("AC/non-AC(A/nAC)");
			ac=sc.next();
			if(ac.contentEquals("AC")==true)
			{
				b=1000;
			}
			else
			{
				b=750;
			}
			System.out.println("Cot(Single/Double)");
			cot=sc.next();
			if(cot.equals("single")==true)
			{
				c=0;
			}
			else
			{
				c=350;
			}
			System.out.println("cable(yes/not)");
			cable=sc.next();
			if(cable.equals("yes")==true)
			{
				d=50;
			}
			else
			{
				d=0;
			}
			System.out.println("WIFI(Yes/Not");
			wifi=sc.next();
			if(wifi.equals("Yes")==true)
			{
				e=200;
			}
			else
			{
				e=0;
			}
			System.out.println("Loundry(Yes/Not");
			laundry=sc.next();
			if(laundry.equals("Yes")==true)
			{
				f=100;
			}
			else
			{
				f=0;
			}
			total=b+c+d+e+f;
			System.out.println("Total= "+total);
			System.out.println("The Services Choosen Are");
			if (b==1000)
			{
				System.out.println("AC Room");	
			}
			else
			{
				System.out.println("NON AC Room");
			}
			if(c==350)
			{
				System.out.println("Double Cort Bed");
			}
			else
			{
				System.out.println("Single Bed");
			}
			if(d==50)
			{
				System.out.println("Cable Connection Enabled");
			}
			else
			{
				System.out.println("No Cable Connection");
			}
			if(e==200)
			{
				System.out.println("WIFI Connection Enabled");
			}
			else
			{
				System.out.println("No WIFI Connection");
			}
			if(f==100)
			{
				System.out.println("With Laundry Service");
			}
			else
			{
				System.out.println("No Laundry Service");
			}
			
			System.out.println("Do you Wand to Proceed");
			
			String proceed=sc.next();
			if(proceed.equals("Yes")==true)
			{
				booked[i]=1;
			
				i=i+1;
				System.out.println("Thank You,Your Room Number Is"+i);
			}
				
		}
	}


