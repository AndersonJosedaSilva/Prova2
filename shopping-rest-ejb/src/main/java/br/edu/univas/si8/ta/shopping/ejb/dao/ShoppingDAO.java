package br.edu.univas.si8.ta.shopping.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.shopping.ejb.entities.Shopping;


@Stateless
public class ShoppingDAO {
	@PersistenceContext(unitName = "shopping")
	private EntityManager em;

	public void insert(Shopping shopping) {
		em.persist(shopping);
	}

	public List<Shopping> listAll() {
		return em.createQuery("from shopping p", Shopping.class).getResultList();
	}

}
