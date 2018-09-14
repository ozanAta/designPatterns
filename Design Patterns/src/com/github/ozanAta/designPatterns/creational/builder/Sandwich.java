package com.github.ozanAta.designPatterns.creational.builder;

/**
 * Example implementation of Singleton Pattern.
 * @author	Ozan ATA
 * @version	1.0
 * @since	13.09.2018
 */


public class Sandwich {
	public static class Builder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder() {
			
		}
		
		public Sandwich getSandwich() {
			return new Sandwich(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}
	
	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;	
	
	private Sandwich(Builder builder) {
		this.bread		= builder.bread == null ? "none" : builder.bread;
		this.condiments	= builder.condiments == null ? "none" : builder.condiments;
		this.dressing	= builder.dressing == null ? "none" : builder.dressing;
		this.meat		= builder.meat == null ? "none" : builder.meat;
	}
	
	public String getBread() {
		return bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}
}
