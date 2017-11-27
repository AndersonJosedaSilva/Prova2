package br.edu.univas.si8.ta.shopping.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.shopping.ejb.dao.ShoppingDAO;
import br.edu.univas.si8.ta.shopping.ejb.entities.Shopping;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.ShoppingLocal;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.ShoppingRemote;


@Stateless
@Local(ShoppingLocal.class)
@Remote(ShoppingRemote.class)
public class ShoppingBean implements ShoppingLocal, ShoppingRemote{
	@EJB
	private ShoppingDAO dao;

	

	@Override
	public void createNewDesc(String shoppingDesc) {
		Shopping shopping = new Shopping();
		shopping.setDesc(shoppingDesc);
		shopping.setTime(new Timestamp(dateNow.getTime()));
		dao.insert(shopping);
		
	}

	@Override
	public String[] listShoppingDesc() {
		return dao.listAll()
				.stream()
				.map(Shopping::getDesc)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

	


}
