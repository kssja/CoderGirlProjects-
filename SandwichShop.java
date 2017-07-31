import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 230;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int veggies = 0;
        int burgers = 0;
        int subs = 0;
        int soup = 0;
        int madeAllGoals = 0; 

        out.println("The sales goal for veggie sandwhiches is " + goalForVeggies);
        out.println("How many veggie sandwiches have you sold today?  ");
        veggies = keyboard.nextInt();

        if(veggies >= goalForVeggies){
            out.println("Made goal for veggies");
            madeAllGoals = ++madeAllGoals;
        }else
        {
            out.println("Fell short of goal for veggies");

        }
        out.println("");
        out.println("The sales goal for burgers is " + goalForBurgers); 
        out.println("how many burgers were sold today?  ");
        burgers = keyboard.nextInt();

        if(burgers >= goalForBurgers)
        {
            out.println("Made goal for burgers.");
            madeAllGoals = ++madeAllGoals;
        }
        else
        {
            out.println("Fell short of goal for burgers");

        }
        out.println("");
        out.println("The sales goal for sub is " + goalForSubs);
        out.println("how many subs were sold today?  ");
        subs = keyboard.nextInt();

        if(subs >= goalForSubs)
        {
            out.println("Made goal for subs.");
            madeAllGoals = ++ madeAllGoals;
        }
        else
        {
            out.println("Fell short of goals for subs");
        }

        out.println("");
        out.println("The sales goal for soups is " + goalForSoup);  
        out.println("How many soups were sold today?  ");
        soup = keyboard.nextInt();
        if(soup >= goalForSoup)
        {
            out.println("Made goal for soup");
            madeAllGoals = ++madeAllGoals;
        }
        else 
        {
            out.println("Fell short of goal for soup");
        }

        out.println("");
        if (madeAllGoals == 4)
        {
            out.println("Made goal for everything");
        }
        else
        {
            out.println("Fell short of goal for everything");
        }

    }
}