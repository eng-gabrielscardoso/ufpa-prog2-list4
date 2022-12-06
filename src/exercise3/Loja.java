package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

import exercise3.abstractions.Produto;
import exercise3.products.Livro;
import exercise3.products.CD;
import exercise3.products.DVD;

public class Loja {
	private static boolean running = true;
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static void main(String[] args) {
		do {
			printOptions();
			
			switch (getOption()) {
			case 1:
				addLivro();
				break;
				
			case 2:
				addCD();
				break;
				
			case 3:
				addDVD();
				break;
				
			case 4:
				imprimirProdutos();
				break;
				
			case 5:
				stop();
				break;

			default:
				break;
			}
			
		} while (running);
	}
	
	public static void printOptions() {
		System.out.println("Bem vindo(a) à Loja Lula-Molusco");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Adicionar produto (Livro)");
		System.out.println("2 - Adicionar produto (CD)");
		System.out.println("3 - Adicionar produto (DVD)");
		System.out.println("4 - Imprimir produtos");
		System.out.println("5 - Encerrar");
	}
	
	public static int getOption() {
		try {
			System.out.print("R: ");
			int option = scan.nextInt();
			return option;			
		} catch (Exception e) {
			System.out.println(e);
			return -1;
		}
	}
	
	public static void addLivro() {
		System.out.println();
		System.out.print("Informe o nome: ");
		String nome = scan.next();
		System.out.print("Informe o preço: ");
		double preco = scan.nextDouble();
		System.out.print("Informe o autor: ");
		String autor = scan.next();
		
		produtos.add(new Livro(nome, preco, autor));
		
		System.out.println("Produto adicionado com sucesso");
		System.out.println();
	}
	
	public static void addCD() {
		System.out.println();
		System.out.print("Informe o nome: ");
		String nome = scan.next();
		System.out.print("Informe o preço: ");
		double preco = scan.nextDouble();
		System.out.print("Informe o número de faixas");
		int numeroDeFaixas = scan.nextInt();
		
		produtos.add(new CD(nome, preco, numeroDeFaixas));
		
		System.out.println("Produto adicionado com sucesso");
		System.out.println();
	}
	
	public static void addDVD() {
		System.out.println();
		System.out.print("Informe o nome: ");
		String nome = scan.next();
		System.out.print("Informe o preço: ");
		double preco = scan.nextDouble();
		System.out.print("Informe a duração: ");
		double duracao = scan.nextDouble();
		
		produtos.add(new DVD(nome, preco, duracao));
		
		System.out.println("Produto adicionado com sucesso");
		System.out.println();
	}
	
	public static void imprimirProdutos() {
		System.out.println();
		for(Produto produto: produtos) {
			System.out.println(produto.toString());
		}
		System.out.println();
	}
	
	public static void stop() {
		running = false;
		scan.close();
		System.out.println("Bye...");
	}
}
