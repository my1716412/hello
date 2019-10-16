package com.yedam.exception;
class Animal {
	
}
class Dog extends Animal {}
class Cat extends Animal {}
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal animal = null;
		Dog dog = new Dog();
		Cat cat = new Cat();
		animal = dog;
		animal = cat;
		Animal animal2 = new Animal();
		
		if (animal instanceof Cat)
			cat = (Cat) animal;
		
		cat = (Cat) animal2;
		
	}
}
