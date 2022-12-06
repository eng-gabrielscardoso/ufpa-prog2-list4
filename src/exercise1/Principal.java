package exercise1;

public class Principal {
	public static void main(String[] args) {
		Retangulo r = new Retangulo(2, 4);
		Triangulo t = new Triangulo(2, 4);
		Circulo c = new Circulo(3);
		
		r.verDados();
		System.out.println();
		t.verDados();
		System.out.println();
		c.verDados();
	}
}
