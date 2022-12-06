package exercise2;

import exercise1.Triangulo;

public class TrianguloIsosceles extends Triangulo {
	public double base, ladosAdjacentes, altura;

	public double getLadosAdjacentes() {
		return this.ladosAdjacentes;
	}

	public void setLadosAdjacentes(double ladosAdjacentes) {
		this.ladosAdjacentes = ladosAdjacentes;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public TrianguloIsosceles(double base, double ladosAdjacentes, double altura) {
		super(base, ladosAdjacentes, ladosAdjacentes, altura);
	}
}
