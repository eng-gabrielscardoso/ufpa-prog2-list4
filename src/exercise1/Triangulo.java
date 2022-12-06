package exercise1;

public class Triangulo extends ObjetoGeometrico implements CalculosGeometricos {
	private double base, ladoEsquerdo, ladoDireito, altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLadoEsquerdo() {
		return ladoEsquerdo;
	}
	
	public void setLadoEsquerdo(double ladoEsquerdo) {
		this.ladoEsquerdo = ladoEsquerdo;
	}
	
	public double getLadoDireito() {
		return ladoDireito;
	}
	
	public void setLadoDireito(double ladoDireito) {
		this.ladoDireito = ladoDireito;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Triangulo(double base, double altura) {
		super(3, new double[] {base, base, base, altura});
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public Triangulo(double base, double ladoEsquerdo, double ladoDireito, double altura) {
		super(3, new double[] {base, ladoEsquerdo, ladoDireito, altura});
		this.setBase(base);
		this.setAltura(altura);
	}

	public double calcularPerimetro() {
		if(this.getLadoEsquerdo() != 0 && this.getLadoDireito() != 0) {
			return this.getBase() + this.getLadoEsquerdo() + this.getLadoDireito();
		}
		
		return this.getBase() * 3;
	}

	public double calcularArea() {
		double s = this.calcularPerimetro() / 2;
		if(this.getLadoEsquerdo() != 0 && this.getLadoDireito() != 0) {
			return Math.sqrt(s * (s - this.getBase()) * (s - this.getLadoEsquerdo()) * (s - this.getLadoDireito()));
		}
		return Math.sqrt(s * (s - this.getBase()) * (s - this.getBase()) * (s - this.getBase()));
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
