package com.simuduck.duck;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("As he is mut he can't say that HE CAN'T SAY so I am writing on his behalf");
	}

}
