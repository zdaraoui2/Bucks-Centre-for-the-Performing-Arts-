import java.util.ArrayList; 

/**
 * A class to provide the attributes and methods for a customer profile
 *
 * @author Zakaria Daraoui
 */
public class CustomerProfile
{
    // instance variables
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private ArrayList<Ticket> tickets;
    
    

    /**
     * Constructor for objects of class CustomerProfile
     */
    public CustomerProfile( String name, String email, String address, String phoneNumber)
    {
        // initialise instance variables
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        tickets = new ArrayList<Ticket>();
    }

    /**
     * A method that purchases a single ticket
     *
     * @param  ticket The ticket that the user is purchasing
     * @return    void
     */
    public void purchaseTicket(Ticket ticket)
    {
        this.tickets.add(ticket);
        System.out.println("The ticket cost " + calculatePrice(ticket.getBasePrice()));
    }
    
    /**
     * A method that purchases the tickets provided to it
     *
     * @param  ticketsToBePurchased The ticket that the user is purchasing
     * @return    void
     */
    public void purchaseTickets(ArrayList<Ticket> ticketsToBePurchased)
    {
        double costIncurred;
        ticketsToBePurchased.forEach((ticket) -> {
            this.tickets.add(ticket);
            System.out.println("This ticket cost " + calculatePrice(ticket.getBasePrice()));
        });
    
    }
    
    /**
     * A method to calculate the price of the ticket
     *
     * @param ticketPrice The base ticket price
     * @return     The ticket price
     */
    public double calculatePrice(double ticketPrice)
    {
        return ticketPrice;
    }
    
    /**
     * A method to get the name of the customer
     *
     * @return   The name of the customer
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * A method to set the name of the customer 
     *
     * @param  name The name to be set
     * @return    void
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * A method to get the email of the customer
     *
     * @return    The email address of the customer
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * A method to set the email of the customer 
     *
     * @param  email The email to be set
     * @return    void
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * A method to get the address of the customer
     *
     * @return    The address of the customer
     */
    public String getAddress()
    {
        return this.address;
    }
    
    /**
     * A method to set the address of the customer 
     *
     * @param  The address to be set
     * @return    void
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     * A method to get the phoneNumber of the customer
     *
     * @return    The phone number of the customer
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    /**
     * A method to set the phone number of the customer 
     *
     * @param  phoneNumber The phone number to be set
     * @return    void
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
      /**
     * A method to get the tickets associated with this customer profile
     *
     * @return    The tickets associated with this customer profile
     */
    public ArrayList<Ticket> getTickets()
    {
        return this.tickets;
    }
    
}
