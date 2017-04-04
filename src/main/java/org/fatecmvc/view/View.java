package org.fatecmvc.view;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.fatecmvc.controller.Employee;
import org.fatecmvc.controller.Vendedor;
import org.fatecmvc.model.Product;

public class View implements Observer {
	private Employee empregado;
	private List<Product> lista; // ConcurrentLinkedQueue

	public View() {
		lista = new LinkedList<Product>();
	}

	/**
	 * 
	 * @param p
	 */
	public void setEmpregado(Employee p) {
		empregado = p;
	}

	/**
	 * @param Lista
	 */
	public void updateSearch(List<Product> l) {
		lista = l;
		empregado.search();
	}

	/**
	 * @param Lista
	 */
	public void updateAdd(List<Product> l) {
		lista = l;
		empregado.add();

	}

	/**
	 * @param Lista
	 */
	public void updateDelete(List<Product> l) {
		lista = l;
		empregado.delete();

	}

	public void displayInventory() {
		if (!lista.isEmpty()) {
			for (Product i : lista) {
				Product produto = i;
				System.out.println("================================================");
				System.out.println("Produto: " + produto.getName());
				System.out.println("Quantidade " + produto.getQuantity());
				System.out.println("Valor de Compra: " + produto.getPurchasePrice());
				System.out.println(("Valor de Venda: " + produto.getSellPrice()));
				System.out.println("================================================");
			}
		} else {
			System.out.println("Não foi encontrado nenhum produto!");
		}
	}

	public void addProduct() {
		Scanner s = new Scanner(System.in);
		String name, description, type;
		Double purchasePrice, profit;
		Integer quantity;
		System.out.println("Digite o nome do produto:");
		name = s.nextLine();
		System.out.println("Digite a descrição do produto:");
		description = s.nextLine();
		System.out.println("Digite o tipo do produto:");
		type = s.nextLine();
		System.out.println("Digite o valor de compra do produto:");
		purchasePrice = s.nextDouble();
		System.out.println("Digite a margem de lucro em porcentagem do produto: ");
		profit = s.nextDouble();
		System.out.println("Digite a quantidade de itens adcionados desse produto:");
		quantity = s.nextInt();
		Product p = new Product(name, description, type, profit, quantity, purchasePrice);
		lista.add(p);
		s.close();
	}

	public void addProductVendor() {
		System.out.println("Você não tem permissão para adcionar produtos, contacte o seu gerente");

	}

	public void deleteProduct() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do produto que você gostaria de deletar");
		String nome = s.nextLine();
		Product p;
		for (int i = 0; i < lista.size(); i++) {
			p = lista.get(i);
			if (p.getName().equals(nome)) {
				System.out.println("Produto " + p.getName() + " encontrado, deletando agora.");
				lista.remove(i);
			}

		}

	}

	public void deleteProductVendor() {
		System.out.println("Você não tem permissão para adcionar produtos, contacte o seu gerente");

	}

}
