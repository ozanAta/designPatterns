package com.github.ozanAta.designPatterns.creational.singleton;

/**
 * Thread-safe implementation of Singleton Pattern.
 * @author	Ozan ATA
 * @version	1.0
 * @since	13.09.2018
 */

public class Singleton {
	// Volatile variables are stored in computer's main memory.
	private static volatile Singleton instance = null;
	
	private Singleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create.");			
		}
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();					
				}
			}
		}
			
		return instance;
	}
	
}