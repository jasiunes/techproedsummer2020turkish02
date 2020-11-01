package day30exceptions;

public class F01 {
/*final.finally ve finalize () arasindaki farklar nelerdir?
 * ==>final ve finally keyword'dur ama finalize() method'dur.
 * final:final keyword'u variable'lardan method'lardan ve class'lardan once kullanilabilir.
	1)final variable:Bir variable final ise,o variable'a bir kere deger atamasi yaparsaniz
bir daha o degeri degistiremezsiniz.
	2)final method: Body'si son halde olan methodlardir.Yani body'si degistirilmeyecek olan methodlardir.
	Final methodlar override edilemezler.(adam bunu dmenizi bekler.)
	3)Final class:Chil'i olamaZ.Inheritance yapilamaz.
	finally:try-catch den sonra kullanilir.Try block exception uretse de üretmese de 
finally block icindeki kod calisir.
	finalize():Java' da Garbage Collector silmesi gereken data'lari 
önce finalize eder sonra imha eder.
	*/
	final double pi = 3.14;
	public static void main(String[] args) {
	
		
		
		

	}

}
