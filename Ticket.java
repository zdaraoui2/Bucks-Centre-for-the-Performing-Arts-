import java.util.Date;

/**
 * A class to contain the required methods and attributes for a ticket
 *
 * @author Zakaria Daraoui
 */
public class Ticket
{
    // instance variables 
    private String showName;
    private Date date;
    private String seatIdentifier;
    private double basePrice;
    

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String showName, Date date, String seatIdentifier, double basePrice)
    {
        // initialise instance variables
        this.showName = showName;
        this.date = date;
        this.seatIdentifier = seatIdentifier;
        this.basePrice = basePrice;
        
    }

    /**
     * A method to get the show name
     *
     * @return    The show name
     */
    public String getShowName()
    {
        return this.showName;
    }
    
    /**
     * A method to set the show name
     *
     * @param  name  The show name
     * @return    void
     */
    public void setShowName(String name)
    {
        this.showName = name;
    }
    
    /**
     * A method to get the show date
     *
     * @return    The date for the show
     */
    public Date getDate()
    {
        return this.date;
    }
    
    /**
     * A method to set the show date
     *
     * @param  date  The show date
     * @return    void
     */
    public void setDate(Date date)
    {
        this.date = date;
    }
    
    /**
     * A method to get the seat identifier
     *
     * @return    The seat identifier
     */
    public String getSeatIdentifier()
    {
        return this.seatIdentifier;
    }
    
    /**
     * A method to set the seat identifier
     *
     * @param  seatIdentifier  The seat identifier
     * @return    void
     */
    public void setSeatIdentifier(String seatIdentifier)
    {
        this.seatIdentifier = seatIdentifier;
    }
    
    /**
     * A method to get the base price
     *
     * @return    The date for the show
     */
    public double getBasePrice()
    {
        return this.basePrice;
    }
    
    /**
    * A method to set the seat base price
     *
     * @param  price  The basePrice
     * @return    void
     */
    public void setBasePrice(double price)
    {
        this.basePrice = price;
    }
}
