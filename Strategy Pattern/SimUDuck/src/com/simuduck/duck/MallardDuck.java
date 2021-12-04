package com.simuduck.duck;

class MallardDuck extends Duck {
	
	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("Show Mallard Duck");
	}
}
