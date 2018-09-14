package com.github.ozanAta.designPatterns.creational.prototype;

public class main {

	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		
		Movie movie = (Movie) prototype.createItem("Movie");
		movie.setTitle("Sharknado");
		movie.setRuntime("1 hour 25 minutes");
		
		Movie anotherMovie = (Movie) prototype.createItem("Movie");
		anotherMovie.setTitle("Sharknado 2: The Second One");
		anotherMovie.setRuntime("1 hour 45 minutes");
		
		System.out.println("-----------------------");
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println("-----------------------");
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println("-----------------------");
	}

}
