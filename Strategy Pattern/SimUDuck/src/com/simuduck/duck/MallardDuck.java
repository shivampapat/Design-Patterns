package com.simuduck.duck;

class MallardDuck extends Duck implements flyable, quackable{
	
	@Override
	public void display() {
		System.out.println("Show Mallard Duck");
	}
	
	public void quack() {
		System.out.println("Mallard Duck quacks");		
	}

	public void fly() {
		System.out.println("Mallard Duck Flys");
	}
}
