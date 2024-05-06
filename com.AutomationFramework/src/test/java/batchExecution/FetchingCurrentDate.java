package batchExecution;

import java.time.LocalDate;
import java.util.Date;

import org.testng.annotations.Test;

public class FetchingCurrentDate {

	@Test
	public void currentDate() {
//		Date currentDate = new Date();
//		
//		int date = currentDate.getDate();
//		System.out.println(date);
//		System.out.println(currentDate.getDay());
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfMonth());
	}
}
