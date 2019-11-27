package Multi_Thredding;

public class Car_treads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();
Car1 c1=new Car1();
Car2 c2=new Car2();
c.start();
c1.start();
c2.start();
	}
}
class Car extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)yield();
			System.out.println("Car A Running "+i);
		}
		System.out.println("Car A Running Complete");
	}
}
class Car1 extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)stop();
			System.out.println("Car B Running "+i);
		}
		System.out.println("Car B Running Complete");
	}
}
class Car2 extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
	{
				if(i==0)
				{
			try {
				System.out.println("Car Running Sleep");
				Thread.sleep(5000);
			}catch(InterruptedException e) {
			e.printStackTrace();
		}}}
}}
