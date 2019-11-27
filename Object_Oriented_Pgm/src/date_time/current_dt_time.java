package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class current_dt_time {

	public static void main(String[] args) {
		 System.out.println("Today Date");
		 LocalDate date=LocalDate.now();//Create a date object
		 System.out.println(date);//display the current date
		 System.out.println("Current Time");
		 LocalTime time=LocalTime.now();//Create a time object
		 System.out.println(time);	
		 System.out.println("Current Date Time");
		 LocalDateTime dt=LocalDateTime.now();//Create a time object
		 System.out.println(dt);
		 
		 
	}

}
