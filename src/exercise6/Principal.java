package exercise6;

import java.util.Scanner;

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	public static Forma[] formas = new Forma[5];
	
	public static void main(String[] args) {
		for(int i = 0; i < formas.length; i++) {
			System.out.println("Informe o tipo de forma");
			System.out.println("1 - Retangulo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Circulo");
			System.out.print("R: ");
			int opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				criarRetangulo(i);
				break;
			case 2:
				criarQuadrado(i);
				break;
			case 3:
				criarCirculo(i);
				break;
			}
		}
		
		int i = 0;
		for(Forma forma: formas) {
			System.out.println("Forma " + i+1);
			System.out.println("Área: " + forma.calcularArea());
			System.out.println("Perímetro: " + forma.calcularPerimetro());
			i++;
		}
	}
	
	public static void criarRetangulo(int index) {
		System.out.print("Informe o lado: ");
		float lado = scan.nextFloat();
		System.out.print("Informe a altura: ");
		float altura = scan.nextFloat();
		
		Retangulo r = new Retangulo(lado, altura);
		
		formas[index] = r;
	}
	
	public static void criarQuadrado(int index) {
		System.out.print("Informe o lado: ");
		float lado = scan.nextFloat();
		
		Quadrado q = new Quadrado(lado);
		
		formas[index] = q;
	}
	
	public static void criarCirculo(int index) {
		System.out.print("Informe o raio: ");
		float raio = scan.nextFloat();
		
		Circulo c = new Circulo(raio);
		
		formas[index] = c;
	}
}
