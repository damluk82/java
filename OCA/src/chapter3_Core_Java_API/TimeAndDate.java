package chapter3_Core_Java_API;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LocalTime time = LocalTime.now();
//		LocalDate date = LocalDate.now();
		
//		System.out.println(time);
//		
//		System.out.println(LocalDate.now());
//		
//		System.out.println(LocaledateTime(date, LocaleTime(12,12)));
//		
//		time = time.of(12, 21);
		
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time)
				.minusDays(1).minusHours(10).minusHours(6).minusHours(11).minusSeconds(30).minusHours(11);
		System.out.println(time);
		
		time = time.minusMinutes(10);
		
		System.out.println(date);
		Period period = Period.of(1,1,1);
		
		date = date.plus(period);
		
		System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		LocalDate date2 = date;
		
		date = date.plusMonths(1);
		
		System.out.println("date: " + date + " " + "date2: " + date2);
		
		
		String hal = "1982 10 12";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy-MMMM-dd");
		
		LocalDate kovi = LocalDate.parse("10 12 1982", dtf);
		
		
		
		System.out.println(kovi.format(dtf2));
		
		
		

		
	}

}
