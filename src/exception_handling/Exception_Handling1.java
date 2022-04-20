package exception_handling;

public class Exception_Handling1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("the divission is ");
	
		try {
			System.out.println("ans = "+(a/b));	
		}
		catch(NullPointerException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("final result");
		}
		System.out.println("program is done");
	}


	}


