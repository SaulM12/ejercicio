package unibe.edu.ec.examen;

public class Numbers {
	private int Number1;
	private int Number2;
	public Numbers(int number1, int number2) {
		super();
		Number1 = number1;
		Number2 = number2;
	}
	public int getNumber1() {
		return Number1;
	}
	public void setNumber1(int number1) {
		Number1 = number1;
	}
	public int getNumber2() {
		return Number2;
	}
	public void setNumber2(int number2) {
		Number2 = number2;
	}
	public int multiplication() {
		return this.Number1 * this.Number2;
	}
	public double division() {
		return this.Number1 / this.Number2;
}
}
