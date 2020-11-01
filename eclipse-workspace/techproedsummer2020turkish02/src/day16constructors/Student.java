package day16constructors;

public class Student {
	int nummer;
	String name;
	static String college= "ITS";
	Student (int r,String n,String college){
		
		this.nummer=r;
		this.name=n;
		this.college=college;
	}

	public static void main(String[] args) {
		
		Student s1 =new Student(111,"Karan","MIT");
		Student s2 = new Student(222,"Aryan","Harvard");
		
		System.out.println(s1.nummer);//111
		System.out.println(s2.nummer);//222
		
		System.out.println(s1.name);//Karan
		System.out.println(s2.name);//Aryan
		
		System.out.println(s1.college);//Hardvard
		System.out.println(s2.college);//Hardvard
	}

}
