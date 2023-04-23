
/**
 * An class to enable a user to log in and out
 *
 * @author Zakaria Daraoui
 */
public abstract class User
{
    // instance variables
    private String username;
    private String password;
    private boolean loggedIn;

    /**
     * Constructor for objects of class User
     */
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }

    /**
     * An method to log users in
     *
     * @param  username  The username to try and log in with
     * @param  password  The password to try and log in with
     * @return    void
     */
    public void logIn(String username, String password)
    {
        if (username == this.username && password == this.password) {
            System.out.println("Log in successful");
            this.loggedIn = true;
        } else {
            System.out.println("Sorry, your details are incorrect");
        }
    }
    
    /**
     * An method to log users out
     *
     * @return    void
     */
    public void logOut()
    {
        System.out.println("Successfully logged out");
        this.loggedIn = false;
    }
}
