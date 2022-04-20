package constructor;

public class Constructor_explicit_calling {
	
	public Constructor_explicit_calling() {
		this(10,11);//explicit calling by programmer
		System.out.println("this is default/no argumental constructor");
	}
public Constructor_explicit_calling(int a) {
	
	System.out.println("one argumental constructor");
}
public Constructor_explicit_calling(int a,int b) {
	this(11);
	System.out.println("two argument constructor");
}
	public static void main(String[] args) {
		
		
    //	Constructor_explicit_calling b1=new Constructor_explicit_calling();//Implicit calling by JVM
	//Constructor_explicit_calling c1=new Constructor_explicit_calling(11);
		Constructor_explicit_calling c2=new Constructor_explicit_calling(11, 77);
		}



}
