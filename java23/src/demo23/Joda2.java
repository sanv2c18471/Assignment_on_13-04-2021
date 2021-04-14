package demo23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Joda2 {
public static void main(String[] args) {
	LocalDateTime ldt = LocalDateTime.of(1950, 01, 01, 5, 52);
	System.out.println("Localdatetime: "+ldt);
	LocalDateTime ldt1 = ldt.plusDays(10);
	System.out.println("Adding Days: "+ldt1);
	LocalDateTime ldt2 = ldt1.plusMonths(4);
	System.out.println("Adding Months: "+ldt2);
	System.out.println("DatetimeFormat: "+ldt2.format(DateTimeFormatter.ISO_DATE_TIME));
}
}
