package com.simuduck.duck;

public class Test {

	public static void main(String[] args) {
		
		Duck duck1 = new MallardDuck();
		Duck duck2 = new RedheadDuck();
		Duck duck3 = new RubberDuck();
		Duck duck4 = new DecoyDuck();
		
		System.out.println("MALLARD");
		duck1.display();
		duck1.swim();
		duck1.performFly();
		duck1.performQuack();
		
		System.out.println("\nREDHEAD DUCK");
		duck2.display();
		duck2.swim();
		duck2.performFly();
		duck2.performQuack();
		
		System.out.println("\nRUBBER DUCK");
		duck3.display();
		duck3.swim();
		duck3.performFly();
		duck3.performQuack();
		
		System.out.println("\nDECOY DUCk");
		duck4.display();
		duck4.swim();
		duck4.performFly();
		duck4.performQuack();
		
		System.out.println("YAYYYYY!!!!!!!! WE COMPLETED OUR STRATEGY PATTERN");
		System.out.println("WE learned here that we have to keep that CHANGE elsewhere and COMBINE things that dont change");
	}

}
