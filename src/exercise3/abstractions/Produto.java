package exercise3.abstractions;

abstract public class Produto {
	private String name;
	private double preco;
	private String codigoDeBarras;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCodigoDeBarras() {
		return this.codigoDeBarras;
	}
	
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public Produto(String name, double preco, String codigoDeBarras) {
		this.setName(name);
		this.setPreco(preco);
		this.setCodigoDeBarras(codigoDeBarras);
	}
	
	public boolean equals(Produto produto) {
		return super.equals(produto.getCodigoDeBarras());
	}
}
