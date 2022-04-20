package constructor;

public class Constructor_problem_obtained_marks {
	int ss;
	int cc;
	int mm;
	
	public Constructor_problem_obtained_marks (int s,int c,int m) {
		ss=s;
		cc=c;
		mm=m;
		
	}
	public static void main(String[] args) {
Constructor_problem_obtained_marks s1=new Constructor_problem_obtained_marks(70,88,99);
Constructor_problem_obtained_marks s2=new Constructor_problem_obtained_marks(79,83,90);
Constructor_problem_obtained_marks s3=new Constructor_problem_obtained_marks(76,99,100);
Constructor_problem_obtained_marks s4=new Constructor_problem_obtained_marks(60,55,100);		
Constructor_problem_obtained_marks s5=new Constructor_problem_obtained_marks(59,77,87);		

System.out.println("Student3 science marks = "+s3.ss);
System.out.println("Student2 chemistry marks = "+s2.cc);
System.out.println("Student5 maths marks = "+s5.mm);
	}

}
