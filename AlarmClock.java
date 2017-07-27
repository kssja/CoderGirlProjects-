import java.lang.Character;
import java.text.DecimalFormat;
import static java.lang.System.out;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlarmClock{


    
    public static void main (String[] args){
        
     String day ="";
     Scanner keyboard= new Scanner(System.in);
     
    out.println("What day is it?");
    day = keyboard.nextLine();
    
    if(day.equalsIgnoreCase("Monday")){
        System.out.println("Its Monday! You need to get up at 8:00 for daycare");
    }else
    if(day.equalsIgnoreCase("Tuesday")){
        System.out.println("Its Tuesday and you have an early day, you need to go to your mothers");
    }else 
    if(day.equalsIgnoreCase("Wednesday")){
        System.out.println("Its Wednesday and you wake up whenever you need to.  You are working from home today!");
    }else
    if(day.equalsIgnoreCase("Thursday")){
        System.out.println("Oh its Thursday. Sorry its a long drive this morning.  You will need to get up at 4:30am");
    }else if(day.equalsIgnoreCase("Friday")){
        System.out.println("Fridat!!! Today is a daycare day.  Get up at 8:00");
    } else
    {System.out.println("Its the weekend!! Sleep in!!");
        }
    
        
        
        
        
        
    }
}