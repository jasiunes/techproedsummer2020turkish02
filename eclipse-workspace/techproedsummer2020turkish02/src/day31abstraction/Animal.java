package day31abstraction;

public abstract class Animal {
/*
1)"abstract"soyut demektir,zit anlamlisi "concrete" dir."concrete" somut demektir.
2)"abstract" class'lardan object üretilemez.Cunku object concrete(somut)'tir. ama "abstract" class "abstract" (soyut)'tur.
3)"abstract" class olusturarak child class'lari bazi seyleri yapmaya mecbur kilariz.
"abstract" class icerisinde olusturdugumuz "abstract" methodlar child class'lar tarafindan
uygulanmak zorundadir.Concurete class icine abstract method yazamayiz.
4)"abstract" class'lar icine "abstract" olmayan methodlar (concrete) yazabilirsiniz.
Bu methodlar child class'lar tarafindan istege bagli olarak kullanilabilirler.
 */

	public abstract void asi();
	public abstract void drink();
	public void yemek () {
		System.out.println("Yemek yerler");
	}

}
