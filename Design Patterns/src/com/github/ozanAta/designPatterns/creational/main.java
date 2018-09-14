package com.github.ozanAta.designPatterns.creational;

import com.github.ozanAta.designPatterns.creational.builder.Sandwich;
import com.github.ozanAta.designPatterns.creational.singleton.Singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich.Builder builder = new Sandwich.Builder();
		
		builder.bread("regular")
				.dressing("mayo")
				.meat("turkey");
		
		Sandwich s = builder.getSandwich();
		System.out.println(s);
		
	}

}
