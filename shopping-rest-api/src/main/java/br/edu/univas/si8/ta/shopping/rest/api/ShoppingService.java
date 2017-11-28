package br.edu.univas.si8.ta.shopping.rest.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/order")
public interface ShoppingService {
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listShoppingDesc();
	
	

	@POST
	@Path("/add/{description}")
	@Produces(MediaType.APPLICATION_JSON)
	Response saveNewDesc(@FormParam("description") String desc);
	
}
