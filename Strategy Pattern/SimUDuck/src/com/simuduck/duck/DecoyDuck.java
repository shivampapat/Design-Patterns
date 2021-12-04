package com.simuduck.duck;

public class DecoyDuck extends Duck{

	@Override
	public void display() {
		System.out.println("Show Decoy Duck");
	}
	
	//But Decoy duck can't swim,fly or quack...
	
	//Overridden to do nothing
	@Override
	public void quack() {
		
	}
	
	//Overridden to do nothing
	@Override
	public void fly() {
		
	}
	
	//Overridden to do nothing
	@Override
	public void swim() {
		
	}
}
