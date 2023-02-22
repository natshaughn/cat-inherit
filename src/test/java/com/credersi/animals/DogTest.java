package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DogTest {
		@Test
		public void testInitialState() {
			Dog dog = new Dog();
			assertTrue(dog.isAlive());
			assertEquals(dog.howHungry(), 50);
	}
	public void testDogAndCatDeath() {
		Dog dog = new Dog();
		Cat cat = new Cat();
		for(int i = 0; i < 2; i++) {
			dog.runs();
			cat.runs();
		}
		assertTrue(!dog.isAlive());
//		assertEquals(dog.howHungry(), 50);
		assertTrue(cat.isAlive());
//		assertEquals(cat.howHungry(), 50);
	}	

}
