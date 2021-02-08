package trimesterTwo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import trimesterTwo.classes.Model.Booking;
import trimesterTwo.classes.Model.Login;

public class BookingService {
	public static String makeBooking(Login login, String bookingStart) {
		if (login == null) {
			return "You are not logged in!";
		}
		
		if (bookingStart == null || "".equals(bookingStart)) {
			return "Please enter the date and hour of the session!";
		}
		
		Date dateStart;
		Date dateEnd;
		try {
			SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH");
			dateStart = parser.parse(bookingStart);
			dateEnd = parser.parse(bookingStart);
			dateEnd.setHours(dateEnd.getHours() + 1);
		} catch(ParseException e) {
			return "Please enter a valid date and hour!";
		}
		
		if (dateStart.before(new Date())) {
			return "Please enter a date and hour in the future!";
		}
		
		if (dateStart.getHours() < 8 || dateEnd.getHours() > 16) {
			return "Please enter a date and hour inside the working time!";
		}
		if (dateStart.getDay() == 0 || dateStart.getDay() == 6) {
			return "Please enter a date and hour inside the working time!";
		}
		
		List<Booking> bookings = getBookings();
		boolean duplicate = false;
		for (int i = 0; i < bookings.size(); i++) {
			Booking booking = bookings.get(i);
			//System.out.println(booking.getDateStart().toString()+""+dateStart.toString());
			boolean sameDay = booking.getDateStart().getDate() == dateStart.getDate();
			boolean sameMonth = booking.getDateStart().getMonth() == dateStart.getMonth();
			boolean sameYear = booking.getDateStart().getYear() == dateStart.getYear();
			boolean sameHour = booking.getDateStart().getHours() == dateStart.getHours();
			if (sameDay && sameMonth && sameYear && sameHour) {
				duplicate = true;
				break;
			}
		}
		if (duplicate) {
			return "This date and hour has already been booked!";
		}
		
		Booking booking = new Booking();
		booking.setLogin(login);
		booking.setDateStart(dateStart);
		booking.setDateEnd(dateEnd);
		bookings.add(booking);
		
		return "You have created a booking!";
	}
	
	
	public static List<Booking> getBookings() {
		final Login login = new Login();
		login.setUsername("penka");
		login.setPassword("penka");
		login.setFirstname("penka");
		login.setLastname("penka");
		login.setPhonenumber("1234567899");
		
		SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH");
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = parser.parse("2022-01-03 10");
			endDate = parser.parse("2022-01-03 11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		final Booking booking = new Booking();
		booking.setLogin(login);
		booking.setDateStart(startDate);
		booking.setDateEnd(endDate);
		List<Booking> result = new ArrayList<>();
		result.add(booking);
		return result;
	}
}
