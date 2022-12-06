package exercise1;

public class Retangulo extends ObjetoGeometrico implements CalculosGeometricos {
	private double base, altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Retangulo(double base, double altura) {
		super(4, new double[] {base, base, altura, altura});
		this.setBase(base);
		this.setAltura(altura);
	}

	public double calcularPerimetro() {
		return (this.getBase() * 2) + (this.getAltura() * 2);
	}

	public double calcularArea() {
		return this.getBase() * this.getAltura();
	}
	
	public void verLados() {
		System.out.print("Lados: ");
		for(double lado: this.getLados()) {
			System.out.print(lado + ", ");
		}
		System.out.println();
	}
	
	public void verDados() {
		System.out.println("Número de lados: " + this.getNumeroDeLados());
		this.verLados();
		System.out.println("Perímetro: " + this.calcularPerimetro());
		System.out.println("Área: " + this.calcularArea());
	}
}
