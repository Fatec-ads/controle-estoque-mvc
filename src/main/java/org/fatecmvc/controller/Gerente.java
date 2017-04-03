package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.ViewBusca;

public class Gerente implements Employee {
	private ViewBusca viewBusca;
	public ViewAdd viewAdd;
	private Subject model;
	
	public void buscaGerente(ViewBusca vb, Subject s){
		viewBusca = vb;
		model = s;
	}

	public void search() {
		viewBusca.displayInventory();

	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
