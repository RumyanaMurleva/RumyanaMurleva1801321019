package trimesterTwo.classes.Model;

import java.util.*;

/**
 * 
 */
public class Booking {

    /**
     * Default constructor
     */
    public Booking() {
    }

    /**
     * 
     */
    private Date dateStart;

    /**
     * 
     */
    private Date dateEnd;

    /**
     * 
     */
    public Login login;

    /**
     * @return
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * @param dateStart 
     * @return
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * @return
     */
    public Date getDateEnd() {
        return dateEnd;
    }

    /**
     * @param dateEnd 
     * @return
     */
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * @return
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login 
     * @return
     */
    public void setLogin(Login login) {
        this.login = login;
    }

}