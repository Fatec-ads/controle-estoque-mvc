package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.View;

public class Gerente implements Employee {
	private View view;
	private Subject model;
	
	/**
	 * 
	 * @param view
	 * @param subject
	 */
	public Gerente(View view, Subject subject){
		this.view = view;
		this.model = subject;
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
