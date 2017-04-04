package org.fatecmvc;

import java.util.Scanner;

import org.fatecmvc.controller.Gerente;
import org.fatecmvc.controller.Vendedor;
import org.fatecmvc.model.Inventory;
import org.fatecmvc.model.Product;
import org.fatecmvc.view.View;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Inventory i = new Inventory();
		initializeInventory(i);
		View v = new View();
		Integer opcao = 9;
		Scanner leitor = new Scanner(System.in);
		
		while (opcao != 0) {
			System.out.println("=============Sistema de Estoque=============");
			System.out.println("Escolha a sua opção");
			System.out.println("1 - Entrar como Gerente");
			System.out.println("2 - Entrar como Vendedor");
			System.out.println("0 - Sair");
			opcao = leitor.nextInt();
			if(opcao.equals(1)){
				Gerente gerente = new Gerente(v, i);
				v.setEmpregado(gerente);
				i.registerObserver(v);
				System.out.println("O que gostaria de fazer?");
				System.out.println("1 - Adcionar produto");
				System.out.println("2 - Buscar produto");
				System.out.println("3 - Deletar produto");
				System.out.println("0 - Sair");
				opcao = leitor.nextInt();
				if(opcao.equals(1)){
					gerente.add();
				}
				else if(opcao.equals(2)){
					gerente.search();;
				}
				else if(opcao.equals(3)){
					gerente.delete();
				}
			}
			else if(opcao.equals(2)){
				Vendedor vendedor = new Vendedor(v, i);
				v.setEmpregado(vendedor);
				i.registerObserver(v);
				System.out.println("O que gostaria de fazer?");
				System.out.println("1 - Adcionar produto");
				System.out.println("2 - Buscar produto");
				System.out.println("3 - Deletar produto");
				System.out.println("0 - Sair");
				opcao = leitor.nextInt();
				if(opcao.equals(1)){
					vendedor.add();
				}
				else if(opcao.equals(2)){
					vendedor.search();
				}
				else if(opcao.equals(3)){
					vendedor.delete();
				}
			}
			
		}
		

	}
	
	public static void initializeInventory(Inventory inventory){
		inventory.addProduct(new Product("Controle Xbox 360", "Controle para ser utilizado no Xbox 360", "Periférico", 40.0, 5, 119.0));
		inventory.addProduct(new Product("Bombril", "Dar brilho nas panelas", "Artigo de limpeza", 200.0, 10000, 2.0));
		inventory.addProduct(new Product("Pilha", "Energizar as coisas", "Periférico", 30.0, 10, 5.0));
	}
}
