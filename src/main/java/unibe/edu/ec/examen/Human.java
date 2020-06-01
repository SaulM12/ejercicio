package unibe.edu.ec.examen;

public class Human {
	private String name, lastname;
	private double high;
	private int age;

	public Human(String name, String lastname, double high, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.high = high;
		this.age = age;
	}

	public Human() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getHigh() {
		return this.high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNameLength() {
		return this.name.length();
	}
	public double divideHigh(double number) {
		return this.high/number;
	}
}
