package trimesterTwo;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trimesterTwo.classes.Model.Login;
import trimesterTwo.models.BookingScreenModel;

public class BookingSteps {

	BookingScreenModel bookingScreenModel = new BookingScreenModel();

	@Given("^A user with a login navigates to the booking screen$")
	public void openScreenWithLogin() throws Throwable {
		final Login login = new Login();
		login.setUsername("penka");
		login.setPassword("penka");
		login.setFirstname("penka");
		login.setLastname("penka");
		login.setPhonenumber("1234567899");
		bookingScreenModel.setLogin(login);
		bookingScreenModel.navigateToMe();
	}
	
	@Given("^A user without a login navigates to the booking screen$")
	public void openScreen() throws Throwable {
		bookingScreenModel.navigateToMe();
	}

	@When("^A booking date and hour is entered \"([^\"]*)\"$")
	public void addUserName(String bookingDate) throws Throwable {
		bookingScreenModel.setBookingDate(bookingDate);
	}

	@When("^The create a booking button is clicked$")
	public void clickLoginButton() throws Throwable {
		bookingScreenModel.clickBookButton();
	}

	@Then("^A message is seen \"([^\"]*)\"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		final String resultMessage = bookingScreenModel.getLoginMessage();
		assertEquals(expectedMessage, resultMessage);
	}
}
