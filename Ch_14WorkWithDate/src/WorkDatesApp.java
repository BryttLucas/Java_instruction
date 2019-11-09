import java.time.*;

import java.time.format.*;

public class WorkDatesApp {

	
		
		LocalDate date = LocalDate.of(1999, Month.DECEMBER, 31);  
		LocalDateTime dateTime = LocalDateTime.now();					// .of(1999, Month.DECEMBER, 31);
		LocalDate date2 = LocalDate.now(); 
		LocalDate date3 = LocalDate.now();                              //  .parse("1999-10-17");
		public static void main(String[] args) {                        // right .now time localDate.now
		LocalTime time = LocalTime.parse("01:01:01.001");               // .parse("01:01:01.001");
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
		int year = date.get.Year();                                      // year,   Month month(two String)
		System.out.println(date);
		System.out.println(year);
		
		boolean isBefore = date.isBefore(date2);
		System.out.println(isBefore);                                   // Before and After date
		
		int compare = date.compareTo(date2);
		System.out.println(compare);
		
		LocalDate date3 = date.withYear(1999);
		
		LocalDate date3 = date.withDayOfYear(365);
		System.out.println(date3);	
		
		LocalDate date4 = date.plus(10, ChronoUnit.DAYS);
		System.out.println(date4);
		
		
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		String dateTmeFormatted = dtFormatter.format(dateTime);
		System.out.println(dateTime);
		System.out.println(dateTimeFormatted);
		
		
	
	}
}
}
