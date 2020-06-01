package unibe.edu.ec.examen;

public class Square {
private double side;

	public Square() {
		
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public double calculateArea() {
		return this.side * this.side;
	}

}
