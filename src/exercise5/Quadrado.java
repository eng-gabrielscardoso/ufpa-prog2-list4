package exercise5;

public class Quadrado implements FormaGeometrica {
	private double lado;
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado(double lado) {
		this.setLado(lado);
	}
	
	public double area() {
		return Math.pow(this.getLado(), 2);
	}

	public double comprimento() {
		return this.getLado() * 4;
	}
}
