package constructor;

public class Constructor_1 {
	public void m1() {
		System.out.println("m1 Non Static method ");
	}
	public Constructor_1() {
		System.out.println("this is default/no argumental constructor");
	}
public Constructor_1(int a) {
	System.out.println("one argumental constructor");
}
public Constructor_1(int a,int b) {
	System.out.println("two argument constructor");
}
	public static void main(String[] args) {
		
		Constructor_1 c1=new Constructor_1(11);
		c1.m1();//explicit calling
		Constructor_1 b1=new Constructor_1();//Implicit calling by JVM
		Constructor_1 c2=new Constructor_1(11, 77);
		}

}
