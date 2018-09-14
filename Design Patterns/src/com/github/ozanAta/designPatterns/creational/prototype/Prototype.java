package com.github.ozanAta.designPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;


/**
 * Example implementation of Prototype Pattern.
 * @author	Ozan ATA
 * @version	1.0
 * @since	14.09.2018
 */
public class Prototype {
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Prototype() {
		loadItems();
	}
	
	/**
	 * This method copies the prototype of the given type and returns it as a new instance.
	 */
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	/**
	 * This method generates prototypes for each type of Item.
	 */
	private void loadItems() {
		Movie movie = new Movie();
		movie.setCategory("-");
		movie.setPrice(0.0);
		movie.setRuntime("NaN");
		movie.setStock(false);
		movie.setTitle("-");
		
		Shirt shirt = new Shirt();
		shirt.setColor("-");
		shirt.setPrice(0.0);
		shirt.setSize("-");
		shirt.setStock(false);
		
		items.put("Movie", movie);
		items.put("Shirt", shirt);
	}
}
