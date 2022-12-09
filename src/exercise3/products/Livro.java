package exercise3.products;

import exercise3.abstractions.Produto;

public class Livro extends Produto {
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Livro(String nome, double preco, String codigoDeBarras, String autor) {
		super(nome, preco, codigoDeBarras);
		this.setAutor(autor);
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getName() + "; Preço: " + this.getPreco() + "; Autor: " + this.getAutor();
	}
}
