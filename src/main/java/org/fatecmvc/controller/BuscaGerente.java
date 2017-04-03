package org.fatecmvc.controller;

import org.fatecmvc.model.Subject;
import org.fatecmvc.view.View;

public class BuscaGerente implements Busca {
	private View view;
	private Subject model;
	
	public void buscaGerente(View o, Subject s){
		view = o;
		model = s;
	}

	public void buscar() {
		view.displayInventory();

	}

}
