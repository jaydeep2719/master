package methods;

public class Methods
{
	public static void m1() 
	{
	System.out.println("i am method m1");
	
	}
	public void m3() {
		System.out.println("i am method m3");
	}
	
public static void main(String[] args) {
	m1();
	Methods2.m2();
	Methods2 m=new Methods2();
	m.m2();
	Methods t=new Methods();
	t.m3();
	m.m4();
}
}
