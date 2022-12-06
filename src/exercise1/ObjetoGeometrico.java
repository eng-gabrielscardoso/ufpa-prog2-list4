package exercise1;

public class ObjetoGeometrico {
	private int numeroDeLados;
	private double[] lados = new double[numeroDeLados];
	
	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}

	public void setNumeroDeLados(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}
	
	public ObjetoGeometrico() {}

	public ObjetoGeometrico(int numeroDeLados) {
		this.setNumeroDeLados(numeroDeLados);
	}
	
	public ObjetoGeometrico(int numeroDeLados, double[] lados) {
		this.setNumeroDeLados(numeroDeLados);
		this.setLados(lados);
	}
}
