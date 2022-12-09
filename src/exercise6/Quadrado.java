package exercise6;

public class Quadrado extends Retangulo {
	public Quadrado(float lado) {
		super(lado, lado);
	}
	
	@Override
	public float calcularArea() {
		return (float) (Math.pow(this.getLado(), 2));
	}
	
	@Override
	public float calcularPerimetro() {
		return (float) (this.getLado() * 4);
	}
}
