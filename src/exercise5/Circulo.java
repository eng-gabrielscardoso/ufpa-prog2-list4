package exercise5;

public class Circulo implements FormaGeometrica, Impressao {
	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}

	public double area() {
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

	public double comprimento() {
		return Math.PI * this.getRaio() * 2;
	}
	
	public void imprimeDados() {
		System.out.println("Raio: " + this.getRaio() + "; Area: " + area() + "; Comprimento: " + comprimento());
	}
}
