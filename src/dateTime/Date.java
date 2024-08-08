
package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime Dtime = LocalDateTime.now();
		System.out.println(Dtime);
		
		DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String fd = Dtime.format(fr);
		System.out.println(fd);
		
	}

	
}
