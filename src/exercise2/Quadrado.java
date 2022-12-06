package exercise2;

import exercise1.Retangulo;

public class Quadrado extends Retangulo {
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Quadrado(double lado) {
		super(lado, lado);
	}
}
