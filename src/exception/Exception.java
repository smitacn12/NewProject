package exception;

public class Exception {
	
	public static void main(String[] args) {
		String[] stud = {"gargi", "chiku", "dada"};
		try {
		System.out.println(stud[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("this happend:    " + e.getMessage() );
		}

}
	}
	

