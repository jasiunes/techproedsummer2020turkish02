package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		E01 obj = new E01();   //Constructr
		System.out.println(obj.getSifre());
		System.out.println(obj.getIsim());
		System.out.println(obj.getCh());
		 obj.setString("Yasemin");
		System.out.println(obj.getIsim());
		
		
		E03 ob= new E03();
		System.out.println(ob.getIsim());
	    System.out.println(ob.getYas());
	    ob.setBorc(2300.24f);//Borc degistirildi ama okuyamiyorum cunku getter yok.
	    
	    ob.setYas((byte) 25);
	    System.out.println(ob.getYas()); //Yas büyüdü
	
	    
	    
	}

}
