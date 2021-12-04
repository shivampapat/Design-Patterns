package com.simuduck.duck;

public class RubberDuck extends Duck{

	@Override
	public void display() {
		System.out.println("Show Rubber Duck");
	}
	
	//Overridden to squeak as rubber duck can't quack
	@Override
	public void quack() {
		System.out.println("Rubber duck Squeaks");
	}
}