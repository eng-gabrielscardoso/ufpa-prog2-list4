package exercise3.products;

import exercise3.abstractions.Produto;

public class CD extends Produto {
	private int numeroDeFaixas;

	public int getNumeroDeFaixas() {
		return numeroDeFaixas;
	}

	public void setNumeroDeFaixas(int numeroDeFaixas) {
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	public CD(String nome, double preco, int numeroDeFaixas) {
		super(nome, preco);
		this.setNumeroDeFaixas(numeroDeFaixas);
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getName() + "; Preço: " + this.getPreco() + "; Número de faixas: " + this.getNumeroDeFaixas();
	}
}
