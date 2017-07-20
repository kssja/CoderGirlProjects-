
/**
 * Write a description of class GroceryList here.
 *
 * @author (ksiegel)
 * @version (version One)public static void main (String[] args)
 */
import java.text.DecimalFormat;
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        String item1 = "";
        String item2 = "";
        String item3 = "";

        int qtyitem1 = 0;
        int qtyitem2 = 0 ;
        int qtyitem3 = 0 ;

        double costitem1 = 0;
        double costitem2 = 0;
        double costitem3 = 0;

        double totalcost = 0;

        out.println("Please list three items on your grocery shopping list.");
        out.println("Item 1?");
        item1 = keyboard.nextLine();

        out.println("Item 2?");
        item2 = keyboard.nextLine();

        out.println("Item 3?");
        item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        out.println("How many " + item1 + "?");
        qtyitem1 = keyboard.nextInt();

        out.println("How many " + item2 + "?");
        qtyitem2 = keyboard.nextInt();

        out.println("How many " + item3 + "?");
        qtyitem3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item");
        out.println("How much does just one " + item1 + " cost?");
        costitem1 = keyboard.nextDouble();

        out.println("How much does just one " + item2 + " cost?");
        costitem2 = keyboard.nextDouble();

        out.println("How much does just one " + item3 + " cost?");
        costitem3 = keyboard.nextDouble();

        out.println("Calculating your grocery bill ");
        totalcost = qtyitem1 * costitem1 + qtyitem2 * costitem2 + qtyitem3 * costitem3;
        
         DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
        out.println("Your total cost is "+df.format(totalcost));
    }    
}
