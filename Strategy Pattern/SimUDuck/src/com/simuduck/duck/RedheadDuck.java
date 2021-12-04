package com.simuduck.duck;

public class RedheadDuck extends Duck{

	public RedheadDuck() {
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("Show RedHead Duck");
	}

}
 