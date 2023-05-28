package TwentyFifthFeb;

public class Animal {
	String color="White";
	
	void eating() {
		System.out.println("Eating.....");
	}
	
	Animal() {
		System.out.println("Animal is created");
	}
	
}

class dog extends Animal {
	String color="Black";
	
	dog() {
		super();
		System.out.println("Dog is created");
		
	}
	
	void displaycolor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eating() {
		System.out.println("Eating Bread....");
		super.eating();
		
	}
}
