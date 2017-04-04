package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.View;

public class Vendedor implements Employee {
	private View view;
	private Subject model;

	public Vendedor(View o, Subject s){
		view = o;
		model = s;
	}

	public void search() {
		view.displayInventory();

	}

	public void add() {
		view.addProductVendor();
		
	}

	public void delete() {
		view.deleteProductVendor();
		
	}

}
