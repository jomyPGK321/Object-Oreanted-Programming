package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formating_dt_tme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime dt=LocalDateTime.now();//Create a time object
		 System.out.println("Before Formatting :" +dt);
		 DateTimeFormatter format=DateTimeFormatter.ofPattern("E - HH:MMM:SS");
		 String formatDate=dt.format(format);
		 System.out.println("After Formating :"+formatDate);
	}

}
