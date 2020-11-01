package day26passbyvalueinheritance;

public class Dog extends Mammal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog od =new Dog();
		od.bark();
		od.drink();
		od.feed();
		od.eat();
		od.smell();
		od.smell();
	}
public  void bark() {
	System.out.println("Havlarlar");
}
public  void smell() {
	System.out.println("Iyi koku alirlar.");
}
}
