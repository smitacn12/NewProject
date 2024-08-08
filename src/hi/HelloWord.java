package hi;
public class HelloWord {
	
	
	
	public static void main(String[] arg) {
		
		/* int family = 11;
		switch(family) {
		case 1:
			System.out.println("Mummy");
			break;
		case 2:
			System.out.println("Pappa");
		default:
			System.out.println("this is invalid:" + family);*/
		
		
		  int page = 10; for(int i= 1; i <= page; i++) {
			  System.out.println(i);
			  if(i == 3)
			  {
				  System.out.println("Stop")	;
				  break;
			  }
		  
		  } 
			/*
			 * String[] kids = {"Chinkshu", "Chiku", "Gargi"}; for(String child : kids) {
			 * System.out.println(child); }
			 */
		 
		
		
		int j = 0;
		while(j<5)
		{
			System.out.println(j);
			j++;
		}
		System.out.println("******************************************");
		
		do {
			System.out.println(j);
			j--;
		}while(j>0);
	}

}
