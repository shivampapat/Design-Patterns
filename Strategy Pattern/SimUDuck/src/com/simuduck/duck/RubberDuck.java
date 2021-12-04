package com.simuduck.duck;

public class RubberDuck extends Duck{

	public RubberDuck() {
		super(new FlyWithoutWings(), new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("Show Rubber Duck");
	}

}
