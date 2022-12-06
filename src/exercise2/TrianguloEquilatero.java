package exercise2;

import exercise1.Triangulo;

public class TrianguloEquilatero extends Triangulo {
	public double lado;

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public TrianguloEquilatero(double lado) {
		super(lado, lado);
	}
}
