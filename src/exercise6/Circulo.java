package exercise6;

public class Circulo extends Forma {
	private float raio;

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public Circulo(float raio) {
		this.setRaio(raio);
	}
	
	@Override
	public float calcularArea() {
		return (float) (Math.PI * Math.pow(this.getRaio(), 2));
	}
	
	@Override
	public float calcularPerimetro() {
		return (float) ((2 * this.getRaio()) * Math.PI);
	}
}
