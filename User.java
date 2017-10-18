import java.util.Arrays;

public class User

{
    public String userName, url, firstName,lastName, emailAddr, post, a, b, c, d, e;

    public User( String url, String userName, String firstName, String lastName, String emailAddr)
    {
        this.url = url;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddr = emailAddr;
    }

    
    
    public String getuserName()
    {
        return this.userName;

    }

    public String getfirstName(){

        return this.firstName;

    }

    public String getlastName()
    {
        return this.lastName;
    }  

    public String getUrl()
    {
        return this.url;
    }

    public String getemailAddr()
    {
        return this.emailAddr;
    }

}
