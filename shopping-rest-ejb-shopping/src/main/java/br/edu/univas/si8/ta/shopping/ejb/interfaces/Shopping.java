package br.edu.univas.si8.ta.shopping.ejb.interfaces;

public interface Shopping {
	
	void createNewDesc(String description,String time);

	String[] listShoppingDesc();
	String[] listShoppingTime();

}
