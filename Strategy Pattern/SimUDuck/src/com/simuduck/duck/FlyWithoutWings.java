package com.simuduck.duck;

public class FlyWithoutWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
