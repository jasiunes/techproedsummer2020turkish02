package day31abstraction;

public abstract class Mammal extends Animal {
/*
 *1)G�rd�g�m�z gibi mammal Animal'in child class'i ve asi() methodu ile drink() methodunu override etmedi
ama herhangi bir compile Time Error vermedi.C�nk� abstract child larin abstract parentteki abstract methodlari 
override etme zorunlulugu yoktur.
 */
	public abstract void feed();
	
	public void move() {
		System.out.println("Hareket ederler.");
	}
}
