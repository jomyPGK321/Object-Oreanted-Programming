package Multi_Thredding;

public class Treads {

	public static void main(String[] args) {
		C t = new C();
		t.start();
	}
}

class C extends Thread {
	{
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Thread going to sleep " + i + " Time");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Thread Running " + i + " Time");
			System.out.println(i);
		}
	}
}
