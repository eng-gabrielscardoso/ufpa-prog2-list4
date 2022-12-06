package exercise1;

public class Circulo extends ObjetoGeometrico implements CalculosGeometricos {
	private double raio;
	
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}

	public double calcularPerimetro() {
		return 0;
	}

	public double calcularArea() {
		return Math.pow(this.getRaio(), 2) * Math.PI;
	}
	
	public void verLados() {
		System.out.println("Esse objeto não possui lados");
	}
	
	public void verDados() {
		System.out.println("Número de lados: " + this.getNumeroDeLados());
		this.verLados();
		System.out.println("Perímetro: " + this.calcularPerimetro());
		System.out.println("Área: " + this.calcularArea());
	}
}
