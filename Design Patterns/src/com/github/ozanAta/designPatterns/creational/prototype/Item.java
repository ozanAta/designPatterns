package com.github.ozanAta.designPatterns.creational.prototype;

public abstract class Item implements Cloneable {
	private double	price;
	private boolean	stock;
	
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

}
