package acces_modifire;

 public class Acces_modifire {// if we declare class as final then we cannot extends 
	public static int a=10;
	protected static int b=12;
	static int c=44;
	private static int d=33;
	public final static int e=11;
	 public static void m1() {
		System.out.println( "i am m1 method");
	}
	 protected static void m2() {
		 b=35;
		 c++;
		 d--;
		// e=35; reinitialization is not possible for final
		 System.out.println("i am m2 method");
	 }
	 static void m3() {
		 System.out.println(d);
		 System.out.println("i am m3 method");
	 }
	private static void m4() {
		 System.out.println("i am m4 method");
	 }
	public final static void m5() {//it cannot override as it is final.
		 System.out.println("i am m5 method");
	 }
	public static void main(String[] args) {
		m4();
		//access modifier 
		//1) public -through out the project.
		//2) protected-through out the package & child class.
		//3) default-through out the package.
		//4) private-through out the class
		//5) final-it is used with the another access modifier.
		
		
		
	}

}
