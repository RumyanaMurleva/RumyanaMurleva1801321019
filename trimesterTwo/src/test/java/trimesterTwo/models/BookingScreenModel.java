package trimesterTwo.models;

import trimesterTwo.classes.Model.Login;
import trimesterTwo.services.BookingService;

public class BookingScreenModel {

	private Login login;
	private String bookingDate;
	private String message;

	public void navigateToMe() {
		System.out.println("The booking screen has been opened!");
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate=bookingDate;		
	}

	public void clickBookButton() {
		message = BookingService.makeBooking(login, bookingDate);
		
	}

	public String getLoginMessage() {
		return message;
	}

}
