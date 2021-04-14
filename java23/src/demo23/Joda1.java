package demo23;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Joda1 {
public static void main(String[] args) {
	LocalDate ld = LocalDate.now();
	LocalDate ld1 = LocalDate.of(1998, 8, 17);
	LocalDate ld2 = LocalDate.parse("2000-03-28",DateTimeFormatter.ISO_DATE);
	System.out.println("Current date: "+ld);
	System.out.println("Given date: "+ld1);
	System.out.println("Date formatter: "+ld2);
}
}
