package exception_handling;

public class Exception_Handling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("the divission is ");
	
		try {
			System.out.println("ans = "+(a/b));	
		}
		catch(Throwable e){
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		System.out.println("program is done");
	}

}
