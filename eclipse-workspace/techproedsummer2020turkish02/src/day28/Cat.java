package day28;

public class Cat extends Animal {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
	}
	public void sound() {
		System.out.println("Miyavlarlar");
}
		
	public void numOfFoot() {
		
		super.numOfFoot();
		System.out.println("D�rt ayaklari vardir.");
	}
	@Override
	public Cat myMethod() {
		Animal obj1 = new Animal ();
		return null;
	}
}