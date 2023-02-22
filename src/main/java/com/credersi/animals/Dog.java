package com.credersi.animals;

public class Dog extends Animal {
	private int lives;
	
	@Override
	protected void dies() {
		this.lives--;
		if (this.lives == 0) {
			super.dies();
		} else {
			this.reset();
		}
	}
	
	public Dog() {
		this.lives = 1;
	}
}