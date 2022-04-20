package acces_modifire;

public class Child   {
	 public static void m1() {
			System.out.println( "i am m1 method");
		}
	 protected static void m2() {
		// b=35;
		// c++;
		// e=35; reinitialization is not possible for final
		 System.out.println("i am m2 method");
	 }
	 static void m3() {
		 System.out.println("i am m3 method");
	 }
	// private static void m4() {
		// System.out.println("i am m4 method");
	// }
	public final static void m5() {
		 System.out.println("i am m5 method");
	 }
	
	public static void main(String[] args) {
		
		//m4();
	}

}
