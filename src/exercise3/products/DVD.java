package exercise3.products;

import exercise3.abstractions.Produto;

public class DVD extends Produto {
	private double duracao;

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public DVD(String nome, double preco, String codigoDeBarras, double duracao) {
		super(nome, preco, codigoDeBarras);
		this.setDuracao(duracao);
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getName() + "; Preço: " + this.getPreco() + "; Duração: " + this.getDuracao();
	}
}
