package com.simuduck.duck;

public class RubberDuck extends Duck implements quackable{

	@Override
	public void display() {
		System.out.println("Show Rubber Duck");
	}
	
	public void quack() {
		System.out.println("Rubber duck Squeaks");
	}
}
