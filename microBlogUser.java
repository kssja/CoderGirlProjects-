import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;


public class microBlogUser{

        
        
    public static void main(String[] args){

        
       User[] stuff = new User[3];

        stuff[0] = new User("NorthPole.com","Chris", "Santa", "Clause","1northpole@yahoo.com");
        stuff[1] = new User("RabbitHole.com","BunnyHop",  "Easter" , "Bunny", "basketofeggs@gmail.com");
        stuff[2] = new User("PumpkinPatch.com", "OneandOnly", "Great", "Pumpkin", "WaitingforGodot.com");

        
        for (int j=0; j< stuff.length;j++){

            System.out.println(stuff[j].getUrl());
            System.out.println(stuff[j].getuserName());
            System.out.println(stuff[j].getfirstName()+" "+stuff[j].getlastName());
            System.out.println(stuff[j].getemailAddr()+"\n");

        }
            
               
        
         Post[] talk = new Post[3];
             
             talk[0] = new Post("Chris","Better Watch out....Santa Clause is coming soon!", "1NorthPole.com");
             talk[1] = new Post("BunnyHop", "Here comes Peter Cottontail hopping down the bunny trail", "basketofeggs@gmail.com");
             talk[2] = new Post("OneandOnly", "Wait in the pumpkin patch, when the moon is full....and wait and wait", "WaitingforGodot.com");
             
            

        for (int m=0; m<talk.length;m++){

            System.out.println(talk[m].getuserName());
            System.out.println(talk[m].getpost());
            System.out.println("Post #: " + (m + 1));
            System.out.println(talk[m].getUrl()+ "\n\n");

        }
             
       }
        
        
    }

