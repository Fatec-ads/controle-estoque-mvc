package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.ViewBusca;

public class BuscaGerente implements Busca {
	private ViewBusca view;
	private Subject model;
	
	public void buscaGerente(ViewBusca o, Subject s){
		view = o;
		model = s;
	}

	public void buscar() {
		view.displayInventory();

	}

}
