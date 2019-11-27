package encapsulation;

public class cssdy4 extends cssdy5 {
	int price;
	int per;
	int i = 1, j = 0;
	String name;
	String g;
	int age;
	double tot = 0, sum = 0;

	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	

	double cssdy5(int age, String g, int per, int price) {

		j++;
		tot = 0;
		double m = .25, o = .10, q = .50;
		if (age < 16) {
			tot = (double) sum + (price - (price * q));
			sum = tot;
			return tot;
		} else if (g.contentEquals("F") == true && age >= 16) {
			tot = sum + (price - price * o);
			sum = tot;
			return tot;
		} else if (age > 64) {
			tot = sum + (price - price * m);
			sum = tot;
			return tot;
		} else {
			tot = sum + price;
			sum = tot;
			return tot;
		}
	}
}

