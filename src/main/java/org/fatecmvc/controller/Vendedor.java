package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.View;

/**
 * 
 * @author marcelo
 *
 */
public class Vendedor implements Employee {
	private View view;
	private Subject model;

	/**
	 * 
	 * @param view
	 * @param subject
	 */
	public Vendedor(View view, Subject subject){
		this.view = view;
		this.model = subject;
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
