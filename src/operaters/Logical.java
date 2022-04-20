package operaters;

public class Logical
{
public void m1()
{
	int a=30;
	int b=40;
	System.out.println(a>b || a==b); // one condition out of two must be true
	System.out.println(a>b && a==b); // both condition must be true
	System.out.println(a<b || a==b);
	System.out.println(a<=b && a==b);
}
public static void main(String[] args) 
{
	Logical t=new Logical();
	t.m1();
}
}
