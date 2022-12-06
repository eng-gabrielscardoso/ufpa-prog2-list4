package exercise2;

import exercise1.Triangulo;

public class TrianguloEscaleno extends Triangulo {
	public double lado, altura;

	public double getLado() {
		return this.lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public TrianguloEscaleno(double base, double ladoEsquerdo, double ladoDireito, double altura) {
		super(base, ladoEsquerdo, ladoDireito, altura);
	}
}
