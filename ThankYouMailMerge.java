import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class ThankYouMailMerge{


public static void main(String[] args){
    double amt= 0;
    String name="";
    Scanner keyboard = new Scanner(System.in);
    name="";
    out.println("Thank You Letter");
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    boolean keepGoing = true;
    
    
    while(keepGoing){
    out.println("\nPlease enter your first and last name  \n ");
       name = keyboard.nextLine();
    if(name.equalsIgnoreCase("quit")){
    out.println("Did you mean to enter quit?" +
    "\nEnter quit again to end the program or yes to continue");
    name = keyboard.nextLine();    
    if(name.equalsIgnoreCase("quit")){
       out.println("Goodbye!");
       keepGoing = false;
    }else {keepGoing = true;
    }
}


while(keepGoing){
        
        out.println("\nPlease enter your first and last name  \n ");
         name = keyboard.nextLine(); 
    
        out.println("How much would you like to contribute?");
        amt = keyboard.nextDouble();
 
    
        out.println(
    
    "\n\nDear " + name + "," +
    
    "\nThank you for your donation!  We rely on donors like you to keep our" +
    "\norganization effective, and you came through for us.  Your donation of "
    +  fmt.format(amt) + 
    "\nwill help our efforts to make a difference in the world."+
    
    "\n\nAs you may know, we are a registered non-profit organization,"+ 
    "\nso your dontation is tax deductible.  You may use this letter" +
    "\nas a receipt for tax purposes. " +
    
    "\n\nThank you again for your support!"+
    
    "\n\nSincerely," +
    "\nPaula Jones" +
    "\nYour Charity.org");
    
    out.print("\n\nDo you have more letters to send?"+
    "\nEnter Yes for more letters or quit to end the program  ");
       
    name = keyboard.nextLine();
    name = keyboard.nextLine();
    if(name.equalsIgnoreCase("quit")){
        out.println("Goodbye!");
        keepGoing = false;
    }else
    keepGoing = true;
}
}
}
}
