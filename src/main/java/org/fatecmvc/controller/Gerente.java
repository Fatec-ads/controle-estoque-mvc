package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.View;

public class Gerente implements Employee {
	private View view;
	private Subject model;
	
	public Gerente(View v, Subject s){
		view = v;
		model = s;
	}

	public void search() {
		view.displayInventory();

	}

	public void add() {
		view.addProduct();
		
	}

	public void delete() {
		view.deleteProduct();
		
	}

}
