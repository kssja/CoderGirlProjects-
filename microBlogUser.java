import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class microBlogUser{

    private String userName, url, firstName,lastName, emailAddr, post;
   

    public microBlogUser(String url, String userName, String firstName, String lastName, String emailAddr )
    {
        this.url = url;
        this.userName = userName;
        this.lastName = lastName;
        this.firstName = firstName;
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

    
    public  microBlogUser(){
       
    }
    
    
    public microBlogUser(String userName, String post, String url)
    {
        
        this.userName = userName;
        this.post = post;
        this.url = url;
    }
    
    public String getpost()
        {
         return this.post;
        }
    
        
    
        
    public static void main(String[] args){

                       
      
         microBlogUser stuff[] = new microBlogUser[3];
        for(int i=0; i<stuff.length; i++){
            stuff[i] = new microBlogUser();

        }

        stuff[0] = new microBlogUser("NorthPole.com","Chris", "Santa", "Clause","1northpole@yahoo.com");
        stuff[1] = new microBlogUser("RabbitHole.com","BunnyHop",  "Easter" , "Bunny", "basketofeggs@gmail.com");
        stuff[2] = new microBlogUser("PumpkinPatch.com", "OneandOnly", "Great", "Pumpkin", "WaitingforGodot.com");

        
        
        for (int j=0; j<stuff.length;j++){

            System.out.println(stuff[j].getUrl());
            System.out.println(stuff[j].getuserName());
            System.out.println(stuff[j].getfirstName()+" "+stuff[j].getlastName());
            System.out.println(stuff[j].getemailAddr()+"\n");

        }
        
        
         microBlogUser talk[] = new microBlogUser[3];
        for(int k=0; k<talk.length; k++){
            talk[k] = new microBlogUser();

        }

        talk[0] = new microBlogUser("Chris","Better Watch out....Christmas is coming soon!", "1NorthPole.com");
        talk[1] = new microBlogUser("BunnyHop", "Here comes Peter Cottontail hopping down the bunny trail", "basketofeggs@gmail.com");
        talk[2] = new microBlogUser("OneandOnly", "Wait in the pumpkin patch, when the moon is full", "WaitingforGodot.com");

        
        
        for (int m=0; m<stuff.length;m++){

            System.out.println(talk[m].getuserName());
            System.out.println(talk[m].getpost());
            System.out.println("Post #: " + (m + 1));
            System.out.println(stuff[m].getUrl()+ "\n\n");

        }
        

    }
}
