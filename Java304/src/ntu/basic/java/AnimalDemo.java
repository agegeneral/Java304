package ntu.basic.java;

public class AnimalDemo {

	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		h.exercise();
		h.writeCode();

		Dog d = new Dog();
		d.eat();
		d.exercise();
		d.watchDoor();

	}

}

class Animal {
	int weight;

	Animal() {
		System.out.println("I am a Animal");
	}

	void eat() {
		weight++;
	}

	void exercise() {
		weight--;
	}
}

class Human extends Animal {

	Human() {
		System.out.println("I am a human");
	}

	void writeCode() {
	};
}

class Dog extends Animal {
	Dog() {
		System.out.println("I am a dog");
	}

	void watchDoor() {
	};
}

class Cat extends Animal {
	void catchMouse() {
	};
}
