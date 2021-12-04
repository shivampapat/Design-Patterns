package com.simuduck.duck;

abstract class Duck {
	 
	//Each duck will have this 
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}
	
	public void swim(){
		System.out.println("All Duck swims even Decoy");
	}
	
	public void display(){
		System.out.println("Shows Duck");
	}
	
	public void performFly() {
		this.flyBehaviour.fly();
	}
	
	public void performQuack() {
		this.quackBehaviour.quack();
	}
	
	//Other duck methods
}
