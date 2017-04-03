package org.fatecmvc.view;

import java.util.LinkedList;
import java.util.List;

import org.fatecmvc.controller.Busca;
import org.fatecmvc.model.Product;

public class ViewBusca implements Observer {
	private Busca busca;
	private List lista;
	
	public ViewBusca(){
		lista = new LinkedList();
	}
	
	public void setBusca(Busca b){
		busca =b;
	}
	
	public void update(List l) {
		lista = l;
		busca.buscar();
	}

	public void displayInventory() {
		if(!lista.isEmpty()){
			for(Object i : lista){
				Product produto = (Product)i;
				System.out.println();
			}
		}
	}

}
