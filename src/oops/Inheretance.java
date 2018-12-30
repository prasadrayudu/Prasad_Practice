package oops;

abstract class Animal {
	String name;

	//cool functionality
	abstract String bark();
}

class Dog extends Animal {
	String bark() {
		return "Bow Bow";
	}
}

class Cat extends Animal {
	String bark() {
		return "Meow Meow";
	}
}

public class Inheretance {
	public static void main(String[] args) {
		Animal animal = new Cat();
		System.out.println(animal.bark());
	}
}