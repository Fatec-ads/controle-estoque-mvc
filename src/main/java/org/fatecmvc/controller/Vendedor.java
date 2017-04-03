package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.ViewBusca;

public class Vendedor implements Employee {
	private ViewBusca view;
	private Subject model;

	public void buscaVendedor(ViewBusca o, Subject s){
		view = o;
		model = s;
	}

	public void search() {
		view.displayInventory();

	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
