package trimesterTwo.classes.Model;

import java.util.*;

/**
 * 
 */
public class Login {

    /**
     * Default constructor
     */
    public Login() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String firstname;

    /**
     * 
     */
    private String lastname;

    /**
     * 
     */
    private String phonenumber;

    /**
     * 
     */
    private List<Booking> bookings;

    /**
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname 
     * @return
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname 
     * @return
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber 
     * @return
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return
     */
    public List<Booking> getBookings() {
        return bookings;
    }

    /**
     * @param bookings 
     * @return
     */
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    /**
     * @param booking 
     * @return
     */
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

}