package constructor;

public class Constructor_problem_using_this_keyward {
	int s;
	int c;
	int m;
	
	public Constructor_problem_using_this_keyward (int s,int c,int m) {
		this.s=s;
		this.c=c;
		this.m=m;
		
	}
	public static void main(String[] args) {
		Constructor_problem_using_this_keyward s1=new Constructor_problem_using_this_keyward(70,88,99);
		Constructor_problem_using_this_keyward s2=new Constructor_problem_using_this_keyward(79,83,90);
		Constructor_problem_using_this_keyward s3=new Constructor_problem_using_this_keyward(76,99,100);
		Constructor_problem_using_this_keyward s4=new Constructor_problem_using_this_keyward(60,55,100);		
		Constructor_problem_using_this_keyward s5=new Constructor_problem_using_this_keyward(59,77,87);		

System.out.println("Student3 science marks = "+s3.s);
System.out.println("Student2 chemistry marks = "+s2.c);
System.out.println("Student5 maths marks = "+s5.m);
	}


}
