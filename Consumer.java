import java.util.ArrayList;
import java.util.List;


/**
 * An class to enable a Consumer to carry out the functions a consumer would want to carry out
 *
 * @author Zakaria Daraoui
 */

class Consumer extends User{
    private CustomerProfile customerProfile;

    Consumer(String username, String password, String name, String address, String phoneNumber, String email, boolean isStudent) {
        super(username, password);
        if (isStudent == true) {
            this.customerProfile = new StudentCustomerProfile(name, email, address, phoneNumber);
        } else {
            this.customerProfile = new CustomerProfile(name, email, address, phoneNumber);
        }

    }
    
        Consumer(String username, String password, String name, String email, String address, String phoneNumber) {
        super(username, password);
        this.customerProfile = new CustomerProfile(name, email, address, phoneNumber);

    }
    

    /**
     * A method that allows the consumer to see a set of predefined upcoming shows
     *
     * @return    void
     */
    public void viewUpcomingShows()
    {
             ArrayList<String> shows = new ArrayList<String>(List.of("Lion King", "Wicked", "Aladdin", "Book of Mormon"));

        for (String show : shows) {
            System.out.println(show);
        }
        
    }

    /**
     * A method to get the customer profile for this consumer
     *
     * @return   The customer profile for this consumer
     */
    public CustomerProfile getCustomerProfile()
    {
        return this.customerProfile;
    }
    
}
