package com.simuduck.duck;

public class RedheadDuck extends Duck implements flyable, quackable{

	@Override
	public void display() {
		System.out.println("Show RedHead Duck");
	}

	public void quack() {
		System.out.println("RedHead Duck quacks");		
	}

	public void fly() {
		System.out.println("RedHead Duck Flys");
	}
}
 