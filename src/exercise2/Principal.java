package exercise2;

public class Principal {
	public static void main(String[] args) {
		Quadrado q = new Quadrado(2);
		TrianguloEquilatero te = new TrianguloEquilatero(2);
		TrianguloIsosceles ti = new TrianguloIsosceles(3, 4, 3);
		TrianguloEscaleno tes = new TrianguloEscaleno(4, 2, 3, 5);
		
		q.verDados();
		System.out.println();
		te.verDados();
		System.out.println();
		ti.verDados();
		System.out.println();
		tes.verDados();
	}
}
