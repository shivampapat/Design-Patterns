package com.simuduck.duck;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Show Decoy Duck");
	}
	
	//As Decoy duck can't swim,fly or quack,
	//It hasn't implemented the flyable and duckable interface
}
