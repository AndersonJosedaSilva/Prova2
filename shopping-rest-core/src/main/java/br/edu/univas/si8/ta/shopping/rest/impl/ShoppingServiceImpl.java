package br.edu.univas.si8.ta.shopping.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;

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
	public Response saveNewDesc(String desc) {
		shopping.createNewDesc(desc);
		return Response.status(Response.Status.CREATED).build();
}




}
