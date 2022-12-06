package exercise3.abstractions;

abstract public class Produto {
	private String name;
	private double preco;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto(String name, double preco) {
		this.setName(name);
		this.setPreco(preco);
	}
}
