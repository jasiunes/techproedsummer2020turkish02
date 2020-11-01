package day25encapsulation;

public class E01 {
/*
 * 1)Encapsulation "data hiding (saklamak) dmektir.Hiding of data.
 * 2) Encapsulation yapmak icin variable'lari "private" yapariz.
 * 3)Encapsulation yaptigimiz variable'i a)Okumak b)Degistirmek icin acabiliriz.
 */
	private int sifre = 123456;
	private String isim ="Ali Can";
	private char ch='Y';
	public static void main(String[] args) {
	

	}
	//Encapsulation yaptiginiz variable 'in baska class'lardan okunabilmesini isterseniz
	//getter method olusturmaniz gerekir.Olustururken ilk get ile yazamalisiniz
	/*getter  olusturmak icin 
	1)Access Modifier public olsun
	2) Return typ yaz 
    3)get + method ismi getSifre.
    4)Method'un icinde "return variable ismi" yazilsin."*/
public int getSifre() {  
return sifre;  //return obje ismi.
}
public String getIsim() {
	return isim;
}

public char getCh() {
	return ch;
}
/*  1)Access Modifier public olsun
	2) Return typ void yaz 
    3)Methid parantezi icine "set + method ismi" getSifre.
    4)Method'un icinde "return variable ismi" yazilsin."
    5)Method body #si icine "this.ch=ch"gibi yaz*/

public void setCh(char ch) {
	this.ch=ch;
}
public void setString(String isim) {
	this.isim=isim;
}
}
