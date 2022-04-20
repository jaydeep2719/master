package methods;

public class Methods3 {

	public static void m1() {
		System.out.println("i am static m1");
		m2();
		//Methods4.m1();
		//Methods4.m2();
	}
	public static void m2() {
		System.out.println("i am static m2");
		Methods4 s=new Methods4();
		s.m3();
		s.m4();
		m1();
	}
	public void m3() {
		System.out.println("i am non static m3");
		//m4();
		//Methods4 y=new Methods4();
		//y.m3();
		//y.m4();
	}
	public void m4() {
		System.out.println("i am non static m4");
		m2();
		m1();
		Methods4.m1();
		Methods4.m2();
	}
	public static void main(String[] args) {
	m2();	
   
	}
}
