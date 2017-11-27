package br.edu.univas.si8.ta.shopping.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.shopping.ejb.interfaces.Shopping;
import br.edu.univas.si8.ta.shopping.rest.api.ShoppingService;

@RequestScoped
public class ShoppingServiceImpl implements ShoppingService{
	@EJB(mappedName = "java:app/shopping-rest-ejb-0.1-SNAPSHOT/ShoppingBean!br.edu.univas.si8.ta.shopping.ejb.interfaces.ShoppingRemote")
	private Shopping shopping;

	@Override
	public String[] listShoppingDesc() {
		return shopping.listShoppingDesc();
	}

	@Override
	public String saveNewDesc(String desc) {
		shopping.createNewDesc(desc);
		return "{\"message\": \"Success\"}";
	}

//	@Override
//	public String[] listClientEmail() {
//		return client.listClientEmail();
//	}


}
