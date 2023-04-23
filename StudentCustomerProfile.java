
/**
 * A class to provide the attributes and methods specific to a student customer profile
 *
 * @author Zakaria Daraoui
 */
public class StudentCustomerProfile extends CustomerProfile
{
    // instance variables - replace the example below with your own
    private boolean verified;

    /**
     * Constructor for objects of class StudentCustomerProfile
     */
    public StudentCustomerProfile( String name, String email, String address, String phoneNumber)
    {
        super(name, email, address, phoneNumber);
    }

    /**
     * A method which verifies student status if valid evidence is provided
     *
     * @param  evidence  A string containing proof of being a student
     * @return    void
     */
    public void verifyStudentStatus(String evidence)
    {
        if (evidence != "") {
            this.verified = true;
        }
    }
    
    /**
     * A method which gets the verified boolean value
     *
     * @return    The student verification status for this profile
     */
    public boolean isVerifiedStudent()
    {
        return this.verified;
    }
    
    /**
     * A method to calculate the price of the ticket
     *
     * @param ticketPrice The base ticket price
     * @return     The ticket price
     */
    public double calculatePrice(double ticketPrice)
    {
        if (this.verified) {
            return 0.75 * ticketPrice;
        } else {
            return ticketPrice;
        }
    }
}
