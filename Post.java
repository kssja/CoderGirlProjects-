
public class Post
{
   public String userName, url, firstName,lastName, emailAddr, post;
     
     
    
    public Post(String userName, String post, String url)
    {
        
        this.userName = userName;
        this.post = post;
        this.url = url;
    }
    
    public String getuserName()
    {
    return  this.userName;
    }
    
    
    public String getUrl()
    {
    return this.url;
   }
    
    public String getpost()
        {
         return this.post;
        }
    
    
        
    }
    