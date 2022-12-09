package exercise6;

public class Retangulo extends Forma {
	private float lado, altura;

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Retangulo(float lado, float altura) {
		this.setAltura(altura);
		this.setLado(lado);
	}

	@Override
	public float calcularArea() {
		return this.getAltura() * this.getLado();
	}

	@Override
	public float calcularPerimetro() {
		return (this.getAltura() * 2 ) + (this.getLado() * 2);
	}
}
