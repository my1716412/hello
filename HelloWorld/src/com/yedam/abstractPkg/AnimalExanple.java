package com.yedam.abstractPkg;

public class AnimalExanple {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.sound();
		System.out.println("====================");
		Animal animal = null;
		animal = cat;
		animalSound(animal);
		animal =dog;
		animalSound(animal);
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
