package JavaConcepts;

import java.util.Calendar;
import java.util.Date;

public class DateandCalander {

	Calendar cal = Calendar.getInstance();
	
	
	public void getCurrentDate()
	{
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(cal.getTime());
		System.out.println(cal.getWeeksInWeekYear());
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		DateandCalander obj = new DateandCalander();
		obj.getCurrentDate();

	}
	
}
